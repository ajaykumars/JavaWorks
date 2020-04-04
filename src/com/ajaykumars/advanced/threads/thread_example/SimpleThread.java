package com.ajaykumars.advanced.threads.thread_example;

/**
 * Created by ajaykumars on 5/27/2017.
 */
public class SimpleThread extends Thread {

    String threadName;
    int threadId;


    public SimpleThread(String threadName, int threadId) {

        this.threadId = threadId;
        this.threadName = threadName;
        Thread.currentThread().setName(this.threadName);
    }

    @Override
    public void run() {
        super.run();
        for (int i =0; i < 10; i++){

            System.out.println("Running Thread : " + Thread.currentThread().getName());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
