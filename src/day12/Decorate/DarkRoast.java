package day12.Decorate;

/**
 * Created by arika on 16/3/21.
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 0.20;
    }
}
