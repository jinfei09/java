package day14;

/**
 * Created by arika on 16/3/23.
 */
public class Coffee extends CoffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
