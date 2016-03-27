package day9;

/**
 * Created by arika on 16/3/17.
 */
public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount){
        balance = balance -amount;
    }
}
