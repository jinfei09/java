package day17.MultiModel;

/**
 * Created by arika on 16/3/26.
 */
public class DuckFactorySimulator {
    public static void main(String[] args) {
        DuckFactorySimulator simulator = new DuckFactorySimulator();
        AbstracDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);

    }

    private void simulate(AbstracDuckFactory duckFactory) {
        Quackable mallardDuckk = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuckk);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
