package com.ajaykumars.java8.default_methods.example_1;

/**
 * Created by ajaykumars on 6/26/2017.
 */
public class Person implements Lovable {

    String name;
    int age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void setAge(int age) {

        this.age = age;
    }


}
