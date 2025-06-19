package com.ajaykumars.java8.predicate.example_2;


import java.util.function.Predicate;

/*
 * Created by ajaykumars on 6/11/2017.
 */
public class IntegerPredicate {

    //Predicate without Args
    public static Predicate<Integer> positiveIntegerPredicate = number -> number < 0;

    public static Predicate<Integer> negativeIntegerPredicate() {
        return number -> number > 0;
    }

    ;

    // Predicate with Args
    public static Predicate<Integer> getExactIntegerPredicate(Integer numberToFind) {
        return number -> number == numberToFind;
    }

    ;

}
