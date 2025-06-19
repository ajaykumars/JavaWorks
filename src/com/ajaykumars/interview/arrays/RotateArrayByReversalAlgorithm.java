package com.ajaykumars.interview.arrays;

import java.util.Arrays;

public class RotateArrayByReversalAlgorithm {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6};

        rotateArray(inputArray, 4);

        System.out.println(Arrays.toString(inputArray));

    }

    public static void reverseArray(int[] arr, int startIndex, int endIndex) {
        int temp;

        while (startIndex < endIndex) {
            temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }

    public static void rotateArray(int[] arr, int d) {
        int arrayLength = arr.length;

        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arrayLength - 1);
        reverseArray(arr, 0, arrayLength - 1);


    }

}
