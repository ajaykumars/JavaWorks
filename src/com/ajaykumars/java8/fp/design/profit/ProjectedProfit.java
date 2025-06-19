package com.ajaykumars.java8.fp.design.profit;

public class ProjectedProfit {

    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[]{42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8};

    public static void main(String[] args) {

        Sales sales = new Sales(FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC));

        FixedCost fixedCosts = new FixedCost(FunctionOverTime.constant(15.0));

        IncrementalCost incrementalCosts = new IncrementalCost(FunctionOverTime.line(5.1, 0.15));

        Profit profit = new Profit(sales, incrementalCosts, fixedCosts);

        double totalProfit = 0.0;

        for (int i = 1; i <= 12; i++) {
            totalProfit = totalProfit + profit.valueAt(i);
        }

        System.out.println("Total yearly profit for the year : " + totalProfit);

    }

}
