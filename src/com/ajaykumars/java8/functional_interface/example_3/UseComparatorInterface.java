package com.ajaykumars.java8.functional_interface.example_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajaykumars on 6/10/2017.
 */
public class UseComparatorInterface {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        stringList.add("AA");
        stringList.add("bb");
        stringList.add("CC");
        stringList.add("BB");
        stringList.add("aa");
        stringList.add("cc");

        System.out.println("Sort with Ignore Case :");
        stringList.sort((string1, string2) -> {return string1.compareToIgnoreCase(string2);});

        stringList.stream().forEach(System.out::println);

        stringList.sort((string1, string2) -> {return string1.compareTo(string2);});

        System.out.println("Sort without Ignore Case :");
        stringList.stream().forEach(string -> System.out.println(string));

    }
}
