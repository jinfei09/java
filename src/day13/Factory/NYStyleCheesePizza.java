package day13.Factory;

/**
 * Created by arika on 16/3/22.
 */
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style sauce and Cheese Pizza";
        dough = "Thin crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
