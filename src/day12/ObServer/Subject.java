package day12.ObServer;

/**
 * Created by arika on 16/3/21.
 */
public interface Subject {
    public void registerMyObserver(MyObserver o);
    public void removeMyObserver(MyObserver o);
    public void notifyMyObservers();
}
