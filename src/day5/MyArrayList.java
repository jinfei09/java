package day5;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by arika on 16/3/11.
 */
public class MyArrayList {
    public static void main(String [] args){
        ArrayList<String> myList = new ArrayList<String>();
        String a = new String("whoohoo");
        myList.add(a);
        String b = new String("Frog");
        myList.add(b);
        System.out.println(myList);
        int theSize = myList.size();
        System.out.println(theSize);
        Object o = myList.get(1);
        System.out.println(o);
        myList.remove(1);
        System.out.println(myList);
        boolean isIn = myList.contains(b);
        System.out.println(isIn);

    }
}
