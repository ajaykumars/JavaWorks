package com.ajaykumars.java8.default_methods.example_2;

import com.ajaykumars.java8.default_methods.example_1.Lovable;
import com.ajaykumars.java8.default_methods.example_1.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajaykumars on 6/26/2017.
 */
public class UseStaticDefaultMethodFromInterface {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Ancy Bella");
        p1.setAge(23);

        Person p2 = new Person();
        p2.setName("Ancy Bella");
        p2.setAge(35);


        List<Person> personList = new ArrayList<Person>();

        personList.add(p1);
        personList.add(p2);

        personList.forEach( person -> System.out.println(Lovable.getInfo(person)));



    }
}
