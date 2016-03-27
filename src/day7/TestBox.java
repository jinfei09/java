package day7;

/**
 * Created by arika on 16/3/15.
 */
public class TestBox {
    Integer i;
    int j;

    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String [] args){
        TestBox t = new TestBox();
        t.go();
    }
}
