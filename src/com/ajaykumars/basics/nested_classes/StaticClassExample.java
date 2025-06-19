package com.ajaykumars.basics.nested_classes;

/*
    -  nested class which is not dependent on parent class instance.
 */
public class StaticClassExample {

    static class StaticClass {

        public void run() {
            System.out.println("Running from static class");
        }

    }

    public static void main(String[] args) {
        new StaticClass().run();

        StaticClass sc = new StaticClass();
        sc.run();
    }

}
