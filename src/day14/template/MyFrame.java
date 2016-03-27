package day14.template;

import javax.swing.*;
import java.awt.*;

/**
 * Created by arika on 16/3/23.
 */
public class MyFrame extends JFrame{
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!!";
        g.drawString(msg, 100, 100);
    }
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
