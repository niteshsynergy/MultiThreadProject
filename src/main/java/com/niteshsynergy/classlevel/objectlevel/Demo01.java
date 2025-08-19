package com.niteshsynergy.classlevel.objectlevel;

public class Demo01 {
    public static void main(String[] args) {
        while(true) {
            Bank sharedBank = new Bank();  // Shared instance for all threads
            Thread t1 = new Thread(() -> {
                sharedBank.deposit(1000); // Friend deposits money
            });

            Thread t2 = new Thread(() -> {
                sharedBank.withdraw(1000); // Brother withdraws
            });

            Thread t3 = new Thread(() -> {
                System.out.println("Balance: " + sharedBank.getBalance()); // You check balance
            });
            t1.start();
            t2.start();
            t3.start();
        }
    }


}
class Bank{
    private double balance = 0;
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }

    public synchronized double getBalance() {
        return balance;
    }
}
/*
When static synchronized method present then it will caaled as class level lock

It does not matter how many obejct or which thread calling from main thread.
It will lock at class level.


 */
