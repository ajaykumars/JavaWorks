package com.ajaykumars.java8.predicate.example_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ajaykumars on 6/11/2017.
 */
public class UsePredicateInterface {

    public static void main(String[] args) {

        Person p1 = new Person("Samman", 47);
        Person p2 = new Person("Samar", 27);
        Person p3 = new Person("Sameer", 67);

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Predicate<Person> predicateYounger = (person) -> person.age <= 30;
        Predicate<Person> predicateOlder = (person) -> person.age >= 60;

        dispalyPerson(personList,predicateOlder);
        dispalyPerson(personList,predicateYounger);


    }

    private static void dispalyPerson(List<Person> personList, Predicate<Person> predicate){

        personList.forEach(person -> {
            if (predicate.test(person)) {
                System.out.println(person.toString());
                }
            });

    }

}
