package com.ajaykumars.java8.streams;


import com.ajaykumars.java8.method_reference.example_1.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamsExample {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alex", 32));
        people.add(new Person("Alexi", 28));
        people.add(new Person("Alexander", 22));
        people.add(new Person("Alexa", 40));

        people.stream().peek(Person::displayPerson);
        people.stream().filter(p -> p.getAge() > 25).peek(p -> System.out.println(p.getAge())).limit(2).collect(Collectors.toList()).forEach(Person::displayPerson);


        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

//        HashMap<String, Person> resultMap = people.stream().collect(Collectors.filtering(
//                Collectors.maxBy(Comparator.comparing(Person::getAge)),
//                Collectors.minBy(Comparator.comparing(Person::getAge)),
//                (p1, p2)-> {HashMap<String, Person> map = new HashMap<>();
//                    map.put("MAX", p1.get());
//                    map.put("MIN", p2.get());
//                    return map;}));
//
//        System.out.println(resultMap);


    }
}
