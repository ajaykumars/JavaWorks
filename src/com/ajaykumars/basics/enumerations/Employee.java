package com.ajaykumars.basics.enumerations;

import java.util.Arrays;

public class Employee {

    String name;
    Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setGender(Gender.MALE);
        System.out.println(e1.getGender());
        System.out.println(e1.getGender().value);

        System.out.println(Gender.valueOf("MALE"));
        System.out.println(Arrays.toString(Gender.values()));

    }

}

