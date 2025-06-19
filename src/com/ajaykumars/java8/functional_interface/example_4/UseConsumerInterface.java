package com.ajaykumars.java8.functional_interface.example_4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumerInterface {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Consumer consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };

        integerList.forEach(consumer);

        integerList.forEach(i -> System.out.println("Number is : " + i));
    }
}
