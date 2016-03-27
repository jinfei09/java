package day12.ObServer;

import java.util.Observable;

/**
 * Created by arika on 16/3/21.
 */
public interface Observer {
    public void update(Observable obs, Object arg);
}
