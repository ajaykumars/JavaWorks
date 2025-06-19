package com.ajaykumars.interview.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDuplicateWords {

    public static void main(String[] args) {

        String line = "I am am alex Alex aLex Boy boy";

        Pattern pattern = Pattern.compile("\\b(\\w+)(\\s+\\1\\b)", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.groupCount());

            line = line.replaceAll(matcher.group(0), matcher.group(1));
        }

        System.out.println(line);

    }
}
