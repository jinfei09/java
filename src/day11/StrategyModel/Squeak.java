package day11.StrategyModel;

/**
 * Created by arika on 16/3/19.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
