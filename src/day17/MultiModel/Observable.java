package day17.MultiModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

/**
 * Created by arika on 16/3/26.
 */
public class Observable implements QuackObservable{

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
//            observer.update(duck);
        }
    }

}
