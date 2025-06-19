package com.ajaykumars.java8.fp.design.profit;

public class IncrementalCost implements QuantityOfInterest {

    FunctionOverTime valueFunction;

    public IncrementalCost(FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }

    @Override
    public String getName() {
        return "Incremental Cost";
    }
}
