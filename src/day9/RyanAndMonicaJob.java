package day9;

/**
 * Created by arika on 16/3/17.
 */
public class RyanAndMonicaJob implements Runnable{

    private BankAccount account = new BankAccount();
    @Override
    public void run() {
        for(int x = 0; x < 10; x++){
            makeWithdrawal(10);
            if(account.getBalance() < 0){
                System.out.println("Overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");

            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " woke up.");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdraw1");
        } else {
            System.out.println(Thread.currentThread().getName() + " completes the withdraw1");
        }
    }

    public static void main(String[] args){

        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();
    }
}
