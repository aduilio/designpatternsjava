package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountItems extends Discount {

    public DiscountItems() {
        super(new DiscountZero());
    }

    @Override
    protected boolean isValid(Budget budget) {
        return budget.getItems() >= 5;
    }

    @Override
    protected BigDecimal doCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }
}
