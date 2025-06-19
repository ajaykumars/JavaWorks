package com.ajaykumars.interview.strings;

public class ReverseCharactersInAString {

    public static void main(String[] args) {

        String str = "palindrome string";

        char[] charArray = str.toCharArray();
        int beginIndex = 0;
        int last = 0;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == ' ') {
                reverse(charArray, beginIndex, i - 1);
                beginIndex = i + 1;
            }
        }

        reverse(charArray, beginIndex, charArray.length - 1);


        System.out.println(charArray);


    }

    public static void reverse(char[] charArray, int beginIndex, int endIndex) {

        char tempChar = ' ';
        for (int i = beginIndex, j = endIndex; i != j; i++, j--) {

            tempChar = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tempChar;

        }

    }

}
