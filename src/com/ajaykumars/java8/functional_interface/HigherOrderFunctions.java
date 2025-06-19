package com.ajaykumars.java8.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;


public class HigherOrderFunctions {


    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x / y;

        Function<BiFunction<Integer, Integer, Integer>, BiFunction<Integer, Integer, Integer>> secondArgZeroCheck =
                function -> (x, y) -> {
                    if (y == 0) {
                        System.out.println("Second argument can't be Zero");
                        return 0;
                    } else {
                        return function.apply(x, y);
                    }
                };

        BiFunction<Integer, Integer, Integer> divideSafe = secondArgZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10, 0));
        System.out.println(divideSafe.apply(10, 2));
    }
}
