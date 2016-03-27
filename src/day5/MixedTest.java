package day5;

/**
 * Created by arika on 16/3/12.
 */
public class MixedTest {
    public static void main(String [] args){
        TestA a = new TestA();
        TestB b = new TestB();
        TestC c = new TestC();
        TestA a2 = new TestC();

        b.m1();
        c.m2();
        a.m3();

        a.m1();
        b.m2();
        c.m3();

        a2.m1();
        a2.m2();
        a2.m3();
    }
}
