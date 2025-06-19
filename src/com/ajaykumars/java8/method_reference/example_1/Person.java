package com.ajaykumars.java8.method_reference.example_1;

/**
 * Created by ajaykumars on 6/11/2017.
 */

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void displayPerson(Person person) {

        System.out.println("Name : " + person.getName() + " with age - " + person.getAge());

    }

    public static boolean checkSeniorCitizen(Person person) {

        return person.getAge() >= 60;

    }


    public boolean checkSeniorCitizens(Person person) {

        return person.getAge() >= 60;

    }
}
