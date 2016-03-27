package day17.MultiModel;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by arika on 16/3/26.
 */
public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }
}
