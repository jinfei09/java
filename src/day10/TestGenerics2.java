package day10;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/18.
 */
public class TestGenerics2 {
    public static void main(String[] args){
        new TestGenerics2().go();
    }

    private void go() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        
        takeAnimals(animals);
    }

    private void takeAnimals(ArrayList<Animal> animals) {
        for(Animal a: animals){
            a.eat();
        }
    }
}
