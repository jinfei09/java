package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by arika on 16/3/11.
 */
public class Gamehelper {
    public String getUserInput(String s) {
        String inputLine = null;
        System.out.print(s + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader
                    (System.in));
            inputLine = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public ArrayList<String> placeDotCom(int i) {
        return null;
    }
}
