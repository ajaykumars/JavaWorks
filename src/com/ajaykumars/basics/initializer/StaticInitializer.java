package com.ajaykumars.basics.initializer;

import java.util.ArrayList;
import java.util.List;

public class StaticInitializer {

    public static List<String> NAMES;
    public List<String> NAMES2;

    static {
        System.out.println("static initializer ....");
        NAMES = new ArrayList<>();
        NAMES.add("Amar");
        NAMES.add("Akbar");
        NAMES.add("Anthony");

    }

    public static void main(String[] args) {
        StaticInitializer.NAMES.forEach(name -> System.out.println(name));
    }

}
