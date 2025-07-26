package com.niteshsynergy.liveclass;


import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUsingExecutors {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newWorkStealingPool(10);
        executor.submit(() -> {
            sendMail("abc@gmail.com");
        });
        executor.submit(() -> {
            sendSMS("sms");
        });

        ExecutorService ex = Executors.newCachedThreadPool();
        ex.submit(() -> {
            for (int i = 0; i < 5; i++) {
                Scanner sc = new Scanner(System.in);
                String bc=sc.nextLine();
                System.out.println(bc+"FOrm Page1(User) ex:---"+Thread.currentThread().getName());
            }

        });
        ex.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("FOrm Page2(User) ex:---"+Thread.currentThread().getName());
            }
        });


        ex.shutdown();
        executor.shutdown();

    }
    public static void sendMail(String email){

            for (int i = 0; i < 2; i++) {
                System.out.println(email+ ": Mail:;,,,"+Thread.currentThread().getName());
            }

    }
    public static void sendSMS(String sms){

        for (int i = 0; i < 2; i++) {
            System.out.println(sms+": SMS:;,,,"+Thread.currentThread().getName());
        }

    }
}
