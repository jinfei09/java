package day7;

import day6.Duck;

/**
 * Created by arika on 16/3/15.
 */
public class MyDuck {
    private int size;
    private static int duckCount = 0;

    public MyDuck(){
        duckCount++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getDuckCount() {
        return duckCount;
    }

    public static void setDuckCount(int duckCount) {
        MyDuck.duckCount = duckCount;
    }
}
