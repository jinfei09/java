package day10;

import java.util.HashMap;

/**
 * Created by arika on 16/3/18.
 */
public class TestMap {
    public static void main(String[] args){
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
