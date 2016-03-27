package day12.Decorate;

/**
 * Created by arika on 16/3/21.
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
