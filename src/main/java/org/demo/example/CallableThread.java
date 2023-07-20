package org.demo.example;

import java.util.concurrent.Callable;

public class CallableThread<ForCallable> implements Callable<ForCallable>{
    @Override
    public ForCallable call() throws Exception {
        System.out.println("This is callable thread");
        return null;
    }
}
