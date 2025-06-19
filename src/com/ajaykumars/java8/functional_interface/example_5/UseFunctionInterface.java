package com.ajaykumars.java8.functional_interface.example_5;

import java.util.function.Function;

public class UseFunctionInterface {

    public int getNumber() {
        return number;
    }

    private int number;

    public UseFunctionInterface(int number) {
        this.number = number;
    }

    public static Integer triple(int number) {
        return number * 3;
    }

    public int tripleIt(int number) {
        return number * 3;
    }

    public static Function<Integer, Integer> createMultiplier(Integer y) {
        return (Integer x) -> x * y;
    }

    public static Integer createMultiplierOf4(Integer y) {
        return 4 * y;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> tripleFunction = UseFunctionInterface::triple;
        Function<Integer, Integer> tripleFunction2 = UseFunctionInterface::triple;
        Function<Integer, Integer> doubleFunction = number -> number * 2;
        Function<Integer, UseFunctionInterface> function = UseFunctionInterface::new;


        Function<Integer, Function<Integer, Integer>> functionOfFunction = (inputNumber1) -> UseFunctionInterface::triple;

        System.out.println(tripleFunction.apply(30));
        System.out.println(doubleFunction.apply(30));
        System.out.println(function.apply(30).getNumber());

        System.out.println(functionOfFunction.apply(40).apply(30));


        Function<Integer, Integer> quadraple = UseFunctionInterface.createMultiplier((Integer) 4);
        Function<Integer, Integer> quadraple2 = UseFunctionInterface::createMultiplierOf4;


    }
}
