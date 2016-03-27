//package day9;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
///**
// * Created by arika on 16/3/17.
// */
//public class MySendListener implements ActionListener{
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        boolean[] checkboxState = new boolean[256];
////        JCheckBox[] checkboxList;
//        for(int i = 0;i<256; i++){
//            JCheckBox check=(JCheckBox)checkboxList.get(i);
//            if(check.isSelected()){
//                checkboxState[i] = true;
//            }
//        }
//
//        try {
//            FileOutputStream fileStream = new FileOutputStream(new File("checkbox.ser"));
//            ObjectOutputStream os = new ObjectOutputStream(fileStream);
//            os.writeObject(checkboxState);
//        } catch (FileNotFoundException e1) {
//            e1.printStackTrace();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//    }
//}
