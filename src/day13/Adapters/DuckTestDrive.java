package day13.Adapters;

/**
 * Created by arika on 16/3/22.
 */
public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey =new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
