package com.ajaykumars.interview.algoritms;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[]{4, 5, 1, 2, 8, 9, 0};
        int temp, arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {

            for (int j = 0; j < arrayLength - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + ",");
        }

    }

}
