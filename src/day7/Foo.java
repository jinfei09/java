package day7;

/**
 * Created by arika on 16/3/15.
 */
public class Foo {
    static final int x=12;
//    final int x;

    public Foo() {
    }

    public static void go(){
        System.out.println(x);
    }

    public static void main(String [] args){
        Foo oo = new Foo();
//        oo.go();
        System.out.println("xx" + x);
    }
}
