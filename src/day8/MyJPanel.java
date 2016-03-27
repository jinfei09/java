package day8;

import javax.swing.*;

/**
 * Created by arika on 16/3/16.
 */
public class MyJPanel {
    public static void main(String[] args){
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        panelB.add(new JButton("button1"));
        panelB.add(new JButton("button2"));
        panelB.add(new JButton("button3"));
        panelA.add(panelB);
    }
}
