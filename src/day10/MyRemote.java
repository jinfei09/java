package day10;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by arika on 16/3/18.
 */
public interface MyRemote extends Remote{
    public String sayHello() throws RemoteException;
}
