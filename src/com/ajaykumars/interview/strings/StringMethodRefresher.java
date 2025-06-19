package com.ajaykumars.interview.strings;

public class StringMethodRefresher {

    public static void main(String[] args) {

        String str = "Prepare for interview";

        System.out.println(str.toCharArray());
        System.out.println(str.charAt(4));

        System.out.println(str.toCharArray().length);
        System.out.println(str.length());

        System.out.println(str.substring(8));
        System.out.println(str.substring(8, 11));


        String str2 = "123";
        int integer_input = 234;

        System.out.println(String.valueOf(integer_input).getClass());
        System.out.println(Integer.valueOf(str2));
        //System.out.println(Integer.valueOf(str)); //NumberFormatException


    }

}
