package org.demo.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static int i;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();

        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.start();

        /*
        CallableThread<ForCallable> callableThread = new CallableThread<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<ForCallable> futureTask = executorService.submit(callableThread);
        futureTask.get();
        */

        runSeveralThreads();

        for (int j = 0; j < 10; j++) {
            Thread chickenThread = new Thread(()-> System.out.println("Спочатку була курка"));
            chickenThread.start();
            chickenThread.join();

            Thread eggThread = new Thread(()-> System.out.println("Спочатку було яйце"));
            eggThread.start();
            eggThread.join();
        }

    }

    public static void runSeveralThreads(){
        for (int j = 0; j < 10; j++) {
            Thread thread = new Thread(()->{
                i++;
                System.out.println(i);});
         thread.start();
        }
    }
}