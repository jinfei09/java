package day15.Component;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by arika on 16/3/23.
 */
public class Menu extends MenuComponent{
    ArrayList menuComponents = new ArrayList();

    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }

    public void print(){
        System.out.println(" " + getName());
        System.out.println("    -- " + getDescription());
        System.out.println("--------------------");
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
