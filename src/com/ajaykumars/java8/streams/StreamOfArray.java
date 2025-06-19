package com.ajaykumars.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOfArray {

    public static void main(String[] args) {

        int[] interger_array = {2, 4, 6, 8, 10};

        String[] str_array = {"abc", "def", "ghi", "jkl"};

        Stream.of(str_array).forEach(System.out::print);
        System.out.println();
        Arrays.stream(interger_array).forEach(System.out::print);


    }
}
