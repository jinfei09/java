package day8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arika on 16/3/16.
 */
public class SimpleGuiB implements ActionListener{
    JButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void  main(String [] args){
        SimpleGuiB gui = new SimpleGuiB();
        gui.go();
    }
}
