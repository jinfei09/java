package day9;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.SocketHandler;

/**
 * Created by arika on 16/3/17.
 */
public class VerySimpleChatServer {
    ArrayList clientOutputStreams;
    public static void main(String[] args){
        new VerySimpleChatServer().go();
    }

    private void go() {
        clientOutputStreams = new ArrayList();

        try {
            ServerSocket serverSock = new ServerSocket(5000);

            while(true){
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.toString();
                System.out.println("got a connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void tellEveryone(String message){
        Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()){
           try {
               PrintWriter writer = (PrintWriter) it.next();
               writer.println(message);
               writer.flush();
           } catch (Exception e){
               e.printStackTrace();
           }
        }
    }
}
