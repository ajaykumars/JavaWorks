package com.ajaykumars.debug;


public class AnagramChecker2 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Input args length should be 2");
            System.exit(1);
        }

        System.out.println(isAnagram(args[0], args[1]));
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() == str2.length()) {

            int[] asciiCharacterArray1 = new int[256];
            int[] asciiCharacterArray2 = new int[256];

            for (char c : str1.toCharArray()) {
                asciiCharacterArray1[(int) c]++;
            }

            for (char c : str2.toCharArray()) {
                asciiCharacterArray2[(int) c]++;
            }

            for (int i = 0; i < 256; i++) {
                if (asciiCharacterArray1[i] != asciiCharacterArray2[i]) {
                    return false;
                }
            }
            return true;
        }

        return false;

    }

}
