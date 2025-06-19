package com.ajaykumars.interview.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(removeDuplicates(array)));

    }


    public static int[] removeDuplicates(int[] array) {
        int[] result_array = new int[10];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                if (array[i] == array[i + 1]) {
                    i++;
                } else {
                    result_array[j] = array[i];
                    j++;
                }
            } else {
                result_array[j] = array[i];
            }
        }
        return result_array;
    }

}
