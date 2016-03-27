package day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by arika on 16/3/16.
 */
public class GameSaveTest {
    public static void main(String [] args){
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"Bow", "Sword", "Dust"});
        GameCharacter two = new GameCharacter(50, "Troll", new String[]{"Bow", "Sword", "Dust"});
        GameCharacter three = new GameCharacter(50, "Magician", new String[]{"Bow", "Sword", "Dust"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
        } catch (IOException e) {
            e.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type: " + oneRestore.getType());
            System.out.println("Two's type: " + twoRestore.getType());
            System.out.println("Three's type: " + threeRestore.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
