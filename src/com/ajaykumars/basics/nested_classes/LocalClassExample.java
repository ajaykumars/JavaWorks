package com.ajaykumars.basics.nested_classes;

public class LocalClassExample {

    public void runExample() {

        class Local {
            void run() {
                System.out.println("running from local");
            }
        }

        new Local().run();

    }

    public static void main(String[] args) {
        new LocalClassExample().runExample();
    }

}
