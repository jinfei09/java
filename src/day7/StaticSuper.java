package day7;

/**
 * Created by arika on 16/3/15.
 */
public class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper(){
        System.out.println("super constructor");
    }
}
