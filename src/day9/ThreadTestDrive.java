package day9;

/**
 * Created by arika on 16/3/17.
 */
public class ThreadTestDrive {
    public static void main(String[] args){
        Runnable theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start();
        System.out.println("back in main");
    }
}
