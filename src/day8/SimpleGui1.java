package day8;

import javax.swing.*;

/**
 * Created by arika on 16/3/16.
 */
public class SimpleGui1 {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
