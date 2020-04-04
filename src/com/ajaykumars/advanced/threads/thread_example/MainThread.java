package com.ajaykumars.advanced.threads.thread_example;

import com.ajaykumars.advanced.threads.thread_example.SimpleThread;

/**
 * Created by ajaykumars on 5/27/2017.
 */
public class MainThread {

    public static void main(String[] args) {

        SimpleThread simpleThread1 = new SimpleThread("Thread-1", 1);
        SimpleThread simpleThread2 = new SimpleThread("Thread-2", 2);

        simpleThread1.start();
        simpleThread2.start();

    }


}
