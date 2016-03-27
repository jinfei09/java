package day9;

/**
 * Created by arika on 16/3/17.
 */
public class TestSync implements Runnable{

    private int balance;

    @Override
    public void run() {
        for(int i = 0; i< 50; i++){
            increment();
            System.out.println("balance is " + balance);
        }
    }

    private synchronized void increment() {
        int i = balance;
        balance = i + 1;
    }
}
