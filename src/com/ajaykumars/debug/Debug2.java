package com.ajaykumars.debug;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Debug2 {

    public static void main(String[] args) {

        String junkFileString = "dhgshdghdghMEM:30-djhsdfjhfjkdhfMEM:40-";

        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("MEM:[0-9]{1,}")
                .matcher(junkFileString);

        while (m.find()) {
            allMatches.add(m.group());
        }

        Double totalMemory = allMatches.stream()
                .map(x -> x.substring(4))
                .map(x -> Double.parseDouble(x))
                .reduce(0.0, (acc, x) -> acc + x);

        System.out.println(totalMemory / allMatches.size());


    }

}
