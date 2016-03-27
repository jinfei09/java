package day15.Component;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by arika on 16/3/24.
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
