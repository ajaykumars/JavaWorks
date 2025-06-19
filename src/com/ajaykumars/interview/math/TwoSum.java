package com.ajaykumars.interview.math;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        Integer[] intArray = {2,3,4,7,6,8};
        int sum = 14;
        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (int i=0; i < intArray.length; i++) {

            intMap.put(intArray[i], i);

        }
        int[] result = new int[2];
        for (int i=0; i< intArray.length-1; i++){

            if(intMap.containsKey(sum - intArray[i]) && intMap.get(Integer.valueOf(sum - intArray[i])) != i){
                result[0] = i;
                result[1] = intMap.get(Integer.valueOf(sum - intArray[i]));
                break;
            }

        }

        System.out.println(result[0] + " " + result[1]);

    }
}
