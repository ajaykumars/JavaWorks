package com.ajaykumars.debug;

import java.util.Arrays;

public class AnagramChecker1 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Input args length should be 2");
            System.exit(1);
        }

        System.out.println(isAnagram(args[0], args[1]));
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            Arrays.sort(charArray1);

            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray2);

            return String.valueOf(charArray1).equals(String.valueOf(charArray2));

        }

        return false;

    }

}
