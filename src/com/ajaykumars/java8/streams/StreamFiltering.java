package com.ajaykumars.java8.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamFiltering {

    public static void main(String[] args) {


        Integer[] intArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Function<Integer, Predicate<Integer>> checkNumberGreaterThan = (x) -> (y) -> y > x;

        Predicate<Integer> checkNumberGreaterThan10 = checkNumberGreaterThan.apply(10);

        Arrays.stream(intArray).filter(checkNumberGreaterThan10).forEach(System.out::println);


    }

}
