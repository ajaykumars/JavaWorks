package com.ajaykumars.interview.strings;

import java.util.Arrays;
import java.util.List;

public class VowelCount {

    public static int getVowelCount(String str) {
        int vowelsCount = 0;

        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        List vowelsList = Arrays.asList(vowels);

        char[] charsInString = str.toCharArray();
        for (int i = 0; i < str.toCharArray().length; i++) {

            if (vowelsList.contains(charsInString[i])) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }


    public static void main(String[] args) {

        System.out.println("Vowel count of String :abracadabra is :" + getVowelCount("abracadabra"));

    }
}
