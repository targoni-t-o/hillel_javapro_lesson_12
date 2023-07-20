package org.demo.example;

public class ExtendedThread extends Thread{

    @Override
    public void run(){
        System.out.println("This is extended thread");
    }
}
