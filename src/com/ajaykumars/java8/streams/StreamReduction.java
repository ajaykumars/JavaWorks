package com.ajaykumars.java8.streams;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class StreamReduction {

    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println(Arrays.stream(intArray).reduce(0, sum));
    }
}
