package com.niteshsynergy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapUsingMultiThread {
    private static ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args)   throws InterruptedException {
        ExecutorService exector = Executors.newFixedThreadPool(5);

        // T1 & T2 concurrent put operations
        Runnable writertask1 = ()->{
            for (int i = 0; i < 5; i++) {
                map.put("key"+i,i);
                System.out.println(Thread.currentThread().getName()+"put:key"+i+"="+i);
                sleepForTime(100);
            }
        };
        Runnable writertask2 = ()->{
            for (int i = 0; i < 5; i++) {
                map.put("key"+i,i);
                System.out.println(Thread.currentThread().getName()+"put:key"+i+"="+i);
                sleepForTime(100);
            }
        };
        // Thread 3 concurrent read operations
        Runnable readertask = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"get:key"+i+"="+map.get("key"+i)+"map:"+map.get("key"+i));

            sleepForTime(100);
            }
        };
        // Thread 4 concurrent comptute operations
        Runnable computeTask = ()->{
            for (int i = 0; i < 10; i++) {
                map.compute("key" + i, (key, val) -> {
                    return val == null ? 1 : val + 1;
                });
                System.out.println(Thread.currentThread().getName() + " compute:key" + i + "=" + map.get("key" + i));
                sleepForTime(100);
            }
        };

        // Execute ALl task;
        exector.submit(writertask1);
        exector.submit(writertask2);
        exector.submit(readertask);
        exector.submit(computeTask);

        exector.shutdown();
        exector.awaitTermination(5, TimeUnit.SECONDS); // waits for all tasks to finish
        System.out.println("Final Map: " + map);
    }
    public static void sleepForTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
