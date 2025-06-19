package com.ajaykumars.interview.strings;

import java.util.Arrays;
import java.util.HashMap;

public class ListDuplicateWordsInAString {

    public static void main(String[] args) {

        String str = "I am am learing Java Java Java";

        String[] listOfWords = str.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        Arrays.asList(listOfWords).forEach(word -> {
            wordCount.put(word, (wordCount.containsKey(word)) ? wordCount.get(word) + 1 : 1);
        });

        wordCount.forEach((key, value) -> {
            if (value > 1) {
                System.out.println("[Key] : " + key + " [Value] : " + value);
            }
        });


    }


}
