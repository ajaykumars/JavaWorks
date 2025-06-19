package com.ajaykumars.java8.lambda_expressions.example_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by ajaykumars on 6/11/2017.
 */
public class UseComsumerInterface {
    public static Consumer PRINT = string -> System.out.println(string);
    public static Consumer<Object> INT_PRINT = number -> System.out.println(number);
    public static void main(String[] args) {

        Integer number;
        List<String> stringList = new ArrayList<String>();

        stringList.add("AA");
        stringList.add("bb");
        stringList.add("CC");
        stringList.add("BB");
        stringList.add("aa");
        stringList.add("cc");


        stringList.forEach(INT_PRINT);

    }


}
