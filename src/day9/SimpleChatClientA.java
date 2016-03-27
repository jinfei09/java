package day9;

import com.sun.codemodel.internal.fmt.JTextFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by arika on 16/3/17.
 */
public class SimpleChatClientA {
    JTextArea incoming;
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    BufferedReader reader;

    public void go(){
        JFrame frame = new JFrame("Ludicrously Simple chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 4242);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            writer.println(outgoing.getText());
            writer.flush();

            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args){
        new SimpleChatClientA().go();
    }

    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while((message = reader.readLine())!=null){
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
