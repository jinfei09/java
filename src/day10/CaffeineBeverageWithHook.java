package day10;

/**
 * Created by arika on 16/3/23.
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    protected abstract void addCondiments();

    protected abstract void brew();


    private boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");

    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
