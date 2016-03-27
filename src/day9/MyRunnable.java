package day9;

/**
 * Created by arika on 16/3/17.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        go();
    }

    private void go() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doMore();
    }

    private void doMore() {
        System.out.println("Top on the stack");
    }
}
