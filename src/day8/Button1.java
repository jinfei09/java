package day8;

import javax.swing.*;
import java.awt.*;

/**
 * Created by arika on 16/3/16.
 */
public class Button1 {
    public static void main(String [] args){
        Button1 gui = new Button1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
//        JButton button = new JButton("click me");
//        frame.getContentPane().add(BorderLayout.EAST, button);
//        frame.setSize(200,200);
//        frame.setVisible(true);

        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
