package com.ajaykumars.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollection {

    public static void main(String[] args) {

        Integer[] intArray = {2, 41, 6, 81, 10, 12, 14, 161, 18, 20};

        long number = Stream.of(intArray).collect(Collectors.counting());
        System.out.println(number);

        Map<String, List<Integer>> map = Stream.of(intArray).collect(Collectors.groupingBy(x -> (x > 10) ? "Above10" : "Below10"));
        System.out.println(map);

    }

}
