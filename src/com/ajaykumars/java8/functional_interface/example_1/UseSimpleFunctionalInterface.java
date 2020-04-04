package com.ajaykumars.java8.functional_interface.example_1;

/**
 * Created by ajaykumars on 6/10/2017.
 */
public class UseSimpleFunctionalInterface {

    public static void main(String[] args) {

        SimpleFunctionalInterface simpleFunctionalInterface = () -> {System.out.println("Hello Java8");System.out.println("Start Exploring Java8");};
        simpleFunctionalInterface.doSomething();

        SimpleFunctionalInterfaceWithArgs simpleFunctionalInterfaceWithArgs = (name) -> {return "Hello "+ name;};
        System.out.println(simpleFunctionalInterfaceWithArgs.sayHello("Java8"));

    }
}
