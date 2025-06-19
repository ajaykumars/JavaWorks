package com.ajaykumars.java8.fp.design.profit;

public class Profit implements QuantityOfInterest {

    Sales sales;
    IncrementalCost incrementalCost;
    FixedCost fixedCost;

    public Profit(Sales sales, IncrementalCost incrementalCost, FixedCost fixedCost) {
        this.sales = sales;
        this.incrementalCost = incrementalCost;
        this.fixedCost = fixedCost;
    }

    @Override
    public double valueAt(int time) {
        return sales.valueAt(time) - incrementalCost.valueAt(time) - fixedCost.valueAt(time);
    }

    @Override
    public String getName() {
        return "Profit";
    }
}
