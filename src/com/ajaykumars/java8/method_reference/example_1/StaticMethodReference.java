package com.ajaykumars.java8.method_reference.example_1;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajaykumars on 6/11/2017.
 */
public class StaticMethodReference {

    public static void main(String[] args) {

        Person p1 = new Person("Samman", 47);
        Person p2 = new Person("Samar", 27);
        Person p3 = new Person("Sameer", 67);

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        System.out.println(">> >> Displaying all Persons : ");
        personList.forEach(Person :: displayPerson );

        System.out.println(">> >> Displaying Person of age > 35 : ");
        personList.stream().filter(person -> person.getAge() > 35).forEach(Person :: displayPerson);


        System.out.println(">> >> Displaying Person of age >= 60 : ");
        personList.stream().filter(Person :: checkSeniorCitizen).forEach(Person :: displayPerson);

    }

}
