package com.ajaykumars.interview.arrays;

import java.util.Arrays;

public class RotateArrayByIndex {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        rotateArrayByTempVariable(inputArray, 2);

    }

    public static int[] rotateArrayByTempArray(int[] inputArray, int index) {

        int[] temp = new int[inputArray.length];
        int localIndex = 0;
        for (int i = index + 1; i < inputArray.length; i++)
            temp[localIndex++] = inputArray[i];

        for (int i = 0; i <= index; i++)
            temp[localIndex++] = inputArray[i];


        return temp;
    }

    public static void rotateArrayByTempVariable(int[] inputArray, int index) {
        //int temp = inputArray[0];
        int arrlength = inputArray.length;
        System.out.println(Arrays.toString(inputArray));
        for (int i = 0; i < index; i++) {
            int temp = inputArray[0];
            for (int j = 1; j < arrlength; j++) {
                inputArray[j - 1] = inputArray[j];
            }
            inputArray[inputArray.length - 1] = temp;
            System.out.println(Arrays.toString(inputArray));
        }


    }


}
