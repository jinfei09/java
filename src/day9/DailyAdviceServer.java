package day9;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by arika on 16/3/17.
 */
public class DailyAdviceServer {
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans",
            "One word: inappropriate", "Just for toda, be honest", "You might" +
            " want to rethink that haircut"};

    public void go(){
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while(true){
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int)(Math.random()*adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args){
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
