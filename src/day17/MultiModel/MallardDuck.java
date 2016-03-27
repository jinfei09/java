package day17.MultiModel;

import java.util.Observer;

/**
 * Created by arika on 16/3/26.
 */
public class MallardDuck implements Quackable{
    Observable observable;
    @Override
    public void quack() {
        System.out.println("Mallard Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
