package day12.Decorate;

/**
 * Created by arika on 16/3/21.
 */
public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
