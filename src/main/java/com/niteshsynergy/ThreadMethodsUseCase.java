package com.niteshsynergy;

public class ThreadMethodsUseCase {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();

        // Here, until we are not calling start method thread will not create at all.
        // Once we call start method our thread will created & intenrlal it will call run then run0 mthod then if we ovvriden then our run mehtod will call
        // or else defual run mehtod will execute of thread class.

        // own run method used to write logic which will executed by threads


        // sleep methos is static mehtod of thread clas swhich is used to sleep current thread for partuclur
        // time.
        Thread.sleep(100);

        // Join mehtod
        // It says lets hold main thread until complet own tast or whoeever joined using thread.join mehtod that
        // will execute as order in multithread basis then it will give permisson to exe main thread.

        // yield method
        // this is alo static method in thread class is used to lets wait & give opp to other thread have either same
        // higher priority to execute it. Shecuylder will get such notificaiton from yield method.



        // isAlive method - if thread is still running or not that we can chekc using this method..


    }
}

