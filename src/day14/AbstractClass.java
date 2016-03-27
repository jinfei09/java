package day14;

/**
 * Created by arika on 16/3/23.
 */
public abstract class AbstractClass {
    final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    private void hook() {
    }

    private final void concreteOperation() {
    }
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
}
