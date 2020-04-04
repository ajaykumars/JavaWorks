package com.ajaykumars.java8.functional_interface.example_2;

/**
 * Created by ajaykumars on 6/10/2017.
 */

/* Functional Interface - Runnable*/

public class UseRunnableInterface {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("Thread-1")).run();
        new Thread(() -> System.out.println("Thread-2")).run();

    }
}
