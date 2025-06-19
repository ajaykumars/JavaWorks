package com.ajaykumars.java8.method_reference.example_2;

import com.ajaykumars.java8.method_reference.example_1.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajaykumars on 6/26/2017.
 */
public class InstanceMethodReference {

    public static void main(String[] args) {

        Person p1 = new Person("Samman", 47);
        Person p2 = new Person("Samar", 27);
        Person p3 = new Person("Sameer", 67);

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        System.out.println(">> >> Displaying Person of age >= 60 : ");
        personList.stream().filter(p1::checkSeniorCitizens).forEach(Person::displayPerson);

    }
}
