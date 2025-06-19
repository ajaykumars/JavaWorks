package com.ajaykumars.java8.fp.design.profit;

public class Sales implements QuantityOfInterest {

    FunctionOverTime valueFunction;

    public Sales(FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }

    @Override
    public String getName() {
        return "Sales";
    }
}
