package com.ajaykumars.java8.basics;

/*
 * Created by ajaykumars on 5/27/2017.
 */
public class SimpleCalcUsingLambdaExp {


    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) ->   a - b;

        SimpleCalcUsingLambdaExp calc = new SimpleCalcUsingLambdaExp();

        System.out.println("Sum of 2 and 3 : " + calc.perform(2, 3, addition));

        System.out.println("Difference of 5 and 3 : " + calc.perform(5, 3, subtraction));


    }

    private int perform(int a, int b, MathOperation mathOperation) {

        return mathOperation.operate(a, b);
    }



    interface MathOperation {

        int operate(int a, int b);
    }

    interface StringOperation{
        int operate(String atr1, String str2);
    }

}
