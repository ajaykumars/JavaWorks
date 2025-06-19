package com.ajaykumars.interview.lambdas;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return a -> a % 2 == 0 ? false : true;
    }

    public PerformOperation isPrime() {

        return a -> {
            return true;
        };
    }

    public PerformOperation isPalindrome() {

        return a -> {
            return true;
        };
    }
}