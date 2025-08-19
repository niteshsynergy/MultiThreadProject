package com.niteshsynergy;

public class ThredGroupExample {
    public static void main(String[] args) {
        // Legecy 1.2 so dont use in latest java
        // ThreadPoolExecutor best sol
        ThreadGroup group1 = new ThreadGroup("TAX");
        ThreadGroup group2 = new ThreadGroup("IT");
        ThreadGroup group3 = new ThreadGroup("Apple");

        Thread t1 = new Thread(group1,"Padul");

        Thread t2 = new Thread(group1,"Padul");
        Thread t3 = new Thread(group1,"Padul");
        Thread t4 = new Thread(group1,"Padul");
        Thread t5 = new Thread(group2,"Nitesh");
        Thread t6 = new Thread(group2,"Nitesh");
        Thread t7 = new Thread(group2,"Nitesh");
        Thread t8 = new Thread(group2,"Nitesh");
        Thread t9 = new Thread(group3,"NiteshSynergy");
        Thread t10 = new Thread(group3,"NiteshSynergy");
        Thread t11= new Thread(group3,"NiteshSynergy");
        Thread t12= new Thread(group3,"NiteshSynergy");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();

        //

    }

}
//
