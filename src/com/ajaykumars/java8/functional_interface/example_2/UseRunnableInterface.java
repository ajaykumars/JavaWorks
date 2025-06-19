package com.ajaykumars.java8.functional_interface.example_2;

/**
 * Created by ajaykumars on 6/10/2017.
 */

/* Functional Interface - Runnable*/

public class UseRunnableInterface {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            int i = 0;
            while (i < 20) {
                System.out.println("Thread-1");
                i++;
            }
        });
        Thread t2 = new Thread(() -> {
            int i = 0;
            while (i < 20) {
                System.out.println("Thread-2");
                i++;
            }
        });

        t1.start();
        t2.start();


    }
}
