package com.niteshsynergy.multiwayscreationOfThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingCallableWithExecutorService {
    public static void main(String[] args) {
        ExecutorService exector = Executors.newSingleThreadExecutor();
        Callable<String> task = ()->{
            return "Hello World";
        };
        try {
            Future<String> future = exector.submit(task);
            System.out.println(future.get());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            exector.shutdown();
        }
    }
}
