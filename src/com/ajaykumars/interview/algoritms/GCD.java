package com.ajaykumars.interview.algoritms;

public class GCD {

    public static void main(String[] args) {
        System.out.println(findGCD2(9, 21));
    }

    private static int findGCD(int input1, int input2) {

        int num1, num2;
        if (input1 > input2) {
            num1 = input1;
            num2 = input2;
        } else {
            num1 = input2;
            num2 = input1;
        }

        System.out.println("Processing : " + num1 + " and " + num2);
        int reminder = num1 % num2;
        while (reminder != 0) {

            num1 = num2;
            num2 = reminder;
            System.out.println("Processing : " + num1 + " and " + num2);
            reminder = num1 % num2;


        }
        return num2;
    }

    private static int findGCD2(int input1, int input2) {
        if (input2 == 0)
            return input1;
        return findGCD2(input2, input1 % input2);
    }

}
