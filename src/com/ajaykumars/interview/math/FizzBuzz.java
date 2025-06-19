package com.ajaykumars.interview.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
       getFizzBuzzList(30).forEach(System.out::println);
    }

    private static List<String> getFizzBuzzList(int number) {

        List<String> resultList = new ArrayList<String>();
        int count3 = 0;
        int count5 = 0;

        for (int i = 1; i <= number; i++){
            String result = "";
            count3++;
            count5++;
            if (count3 == 3){result += "Fizz";count3 = 0;}
            if (count5 == 5){result += "Buzz";count5 = 0;}
            if (result.equals("")){result+=i;}
            resultList.add(result);

        }

        return resultList;
    }

}
