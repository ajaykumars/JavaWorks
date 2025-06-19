package com.ajaykumars.java8.predicate.example_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ajaykumars on 6/11/2017.
 */
public class UseIntegerPredicate {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(-6, 6, -5, -2, -3, 0, -1, 5, 3, 4, 1);

        displayNumbers(integerList, IntegerPredicate.positiveIntegerPredicate);
        displayNumbers(integerList, IntegerPredicate.negativeIntegerPredicate());
        displayNumbers(integerList, IntegerPredicate.getExactIntegerPredicate(4));


    }

    public static void displayNumbers(List<Integer> integerList, Predicate<Integer> predicate) {

        integerList.forEach(integer -> {
            if (predicate.test(integer)) {
                System.out.print(integer);
                System.out.print(" ");
            }
        });

        System.out.println();

    }
}
