package com.ajaykumars.java8.basics;

import com.ajaykumars.java8.method_reference.example_1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alex", 34),
                new Person("Amit", 24),
                new Person("Austin", 29),
                new Person("Amigo", 30)
        );
        List<Person> seniors = people
                .stream()
                .filter(person -> person.getAge() >= 30)
                .collect(Collectors.toList());

    }


}
