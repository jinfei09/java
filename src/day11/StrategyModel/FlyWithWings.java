package day11.StrategyModel;

/**
 * Created by arika on 16/3/19.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
