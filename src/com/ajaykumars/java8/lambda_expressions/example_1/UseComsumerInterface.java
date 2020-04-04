package com.ajaykumars.java8.lambda_expressions.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajaykumars on 6/11/2017.
 */
public class UseComsumerInterface {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        stringList.add("AA");
        stringList.add("bb");
        stringList.add("CC");
        stringList.add("BB");
        stringList.add("aa");
        stringList.add("cc");


        stringList.stream().forEach(string -> System.out.println(string));


    }


}
