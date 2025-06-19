package com.ajaykumars.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamModification {

    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u'};
        List<String> stringList = Arrays.asList(new String[] {"abc", "def", "ghi", "jkl"});

        stringList.stream().filter(StreamModification::hasVowels).peek(System.out::println).forEach(System.out::println);
        System.out.println(hasVowels("abc"));
    }

    static boolean hasVowels(String str){
        List<Character> vowels = Arrays.asList(new Character[]{'a','e','i','o','u'});
        //List<Character> stringCharacters = Arrays.asList(str.toCharArray()).
        long vowelCount = Arrays.asList(str.toCharArray()).stream().filter(ch -> vowels.contains(Character.valueOf(ch[0]))).count();

        return (vowelCount > 0) ? true : false;
    }

}
