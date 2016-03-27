package day10;

/**
 * Created by arika on 16/3/18.
 */
public class TestGenerics1 {
    public static void main(String[] args){
        new TestGenerics1().go();
    }

    private void go() {
        Animal[] animals= {new Dog(), new Cat(), new Dog()};
        System.out.println(animals);
    }
}
