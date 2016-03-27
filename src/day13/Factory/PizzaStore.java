package day13.Factory;
/**
 * Created by arika on 16/3/21.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza ordderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
//        pizza.prepare
        return pizza;
    }

    public Pizza orderPizza(String cheese) {
        Pizza pizza = new Pizza() {
        };
        return pizza;
    }
}
