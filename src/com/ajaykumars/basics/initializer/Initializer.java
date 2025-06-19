package com.ajaykumars.basics.initializer;

import java.util.ArrayList;
import java.util.List;

public class Initializer {

    public List<String> NAMES;

    {
        System.out.println("initializer ....");
        NAMES = new ArrayList<>();
        NAMES.add("Amar");
        NAMES.add("Akbar");
        NAMES.add("Anthony");

    }

    public Initializer(String name) {
        System.out.println("constructor ...");
        NAMES.add(name);
    }

    public static void main(String[] args) {
        new Initializer("Olgas").NAMES.forEach(name -> System.out.println(name));
        new Initializer("Olgas").NAMES.forEach(name -> System.out.println(name));


    }


}
