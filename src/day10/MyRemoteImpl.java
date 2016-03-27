package day10;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by arika on 16/3/18.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello(){
        return "Server says, Hey";
    }

    public static void main(String[] args){
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote_Hello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
