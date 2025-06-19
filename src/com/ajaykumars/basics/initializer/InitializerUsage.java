package com.ajaykumars.basics.initializer;

public class InitializerUsage {

    public static void main(String[] args) {

        Initializer initializer = new Initializer("Zen");

        initializer.NAMES.add("Ram");
        initializer.NAMES.add("Rahim");
        initializer.NAMES.add("Robert");

        System.out.println(initializer.NAMES);
    }

}
