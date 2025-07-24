package com.niteshsynergy.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsUtilsClass {
    public static void main(String[] args) {
        // Executors is utils class from java.util.concurrent package
        // IUsed to create thread poll & mnage it
        Executors executors = null; // contains method related to create either fixed or sibgle
        // single or cached thread pool & manage all thread which are used in our code.
        // For details open source code of Executors & read it.

//        ExecutorService is an interface that provide high level management using
//                submit task, manage thread life cycle, control concurrency
        // 1. newFixedThreadPool(N): It used to create fixed thread when we know no of request is fixed then use it

        // processing load stable rate
        ExecutorService ex = Executors.newFixedThreadPool(10);
        ex.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        ex.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        ex.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        ex.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        ex.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        ex.shutdown();

        // use to create only one thread at once.
        // sequ work process is good using this.
        ExecutorService ex2 = Executors.newSingleThreadExecutor();
        ex2.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });


        // 3. newCachedThreadPool
        // Used to create thread as needed & reuse ocne it is ideal.
        // short lives high - value , lightweight taks.
        ExecutorService ex3 = Executors.newCachedThreadPool();

        ex3.submit(()->{
            System.out.println(Thread.currentThread().getName());

        });
        // 4. newWorkStealingPool is used to creare pool using
        // work stealing algo (parallel process)
        // eg- max CPU utilization
        ExecutorService ex4 = Executors.newWorkStealingPool();
        ex4.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });

        // submit method is used to send task for execution

        // shutdown method means clealy stop the execution.
        // thread pool: Improve performance avoid overhead of creating threads repeatdly.

        /*
        Runnable vs Callable
        - in RUnnable not tracking possible of current activy
        - in callabla it is possible to track using Future.
        - in runnable no Future , no blocking, NO Retrival in Callable all these prsent.
        - RUnnbale used with thread class.
        - Callable used with Executor Service.submit(callable,task)
        - in runnable we need try catch or throws manually due to unchecked exeception.
        - in callable propogate to checkedException


         */

    }
}