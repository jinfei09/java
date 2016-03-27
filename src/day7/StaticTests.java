package day7;

/**
 * Created by arika on 16/3/15.
 */
public class StaticTests extends StaticSuper{
    static int rand;
    static {
        rand = (int)(Math.random()*6);
        System.out.println("static block" + rand);
    }

    public StaticTests() {
        System.out.println("StaticTests constructor");
    }

    public static void main(String [] args){
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}
