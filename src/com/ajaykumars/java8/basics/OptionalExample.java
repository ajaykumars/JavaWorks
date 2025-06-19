package com.ajaykumars.java8.basics;

/*

 - Container object with holds values/objects and has utils for handling NPE.

 */


import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> optionalName = Optional.empty();

//        String name = "Vijay   ";
        String name = null;
        optionalName = Optional.ofNullable(name);

//        if (optionalName.isPresent()) {
//            System.out.println("Present");
//        } else {
//            System.out.println(optionalName.orElse("Ajay"));
//        }
//
//        System.out.println(optionalName.map(String::length).get());


        System.out.println(optionalName.orElse("Name is NULL; so its Ajay"));

        optionalName.ifPresentOrElse(System.out::println, () -> System.out.println("Name is NULL; so its Ajay"));


    }
}
