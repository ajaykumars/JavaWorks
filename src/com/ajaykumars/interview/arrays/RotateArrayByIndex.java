package com.ajaykumars.interview.arrays;

import java.util.Arrays;

public class RotateArrayByIndex {

    public static void main(String[] args) {

        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(rotateArrayByIndex(inputArray,3)));


    }

    public static int[] rotateArrayByIndex(int[] inputArray,int index){

        int[] temp = new int[inputArray.length];
        int localIndex =0 ;
        for (int i= index+1; i<inputArray.length; i++)
            temp[localIndex++] = inputArray[i];

        for (int i=0;i<=index;i++)
            temp[localIndex++] = inputArray[i];


        return temp;
    }

}
