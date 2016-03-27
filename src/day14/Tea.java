package day14;

/**
 * Created by arika on 16/3/23.
 */
public class Tea extends CoffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
