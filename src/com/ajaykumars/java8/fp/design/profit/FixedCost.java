package com.ajaykumars.java8.fp.design.profit;

public class FixedCost implements QuantityOfInterest {

    FunctionOverTime valueFunction;

    public FixedCost(FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }

    @Override
    public String getName() {
        return "Fixed Cost";
    }
}
