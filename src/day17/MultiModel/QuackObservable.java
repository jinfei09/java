package day17.MultiModel;

import java.util.Observer;

/**
 * Created by arika on 16/3/26.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
