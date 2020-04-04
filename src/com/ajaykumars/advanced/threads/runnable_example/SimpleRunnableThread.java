package com.ajaykumars.advanced.threads.runnable_example;

/**
 * Created by ajaykumars on 5/27/2017.
 */
public class SimpleRunnableThread implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {

            System.out.println("Running thread : " + Thread.currentThread().getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
