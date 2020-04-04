package com.ajaykumars.advanced.threads.runnable_example;

/**
 * Created by ajaykumars on 5/27/2017.
 */
public class MainRunnableThread {

    public static void main(String[] args) {

        SimpleRunnableThread simpleRunnableThread1 = new SimpleRunnableThread();
        SimpleRunnableThread simpleRunnableThread2 = new SimpleRunnableThread();

        new Thread(simpleRunnableThread1).start();
        new Thread(simpleRunnableThread2).start();


    }

}
