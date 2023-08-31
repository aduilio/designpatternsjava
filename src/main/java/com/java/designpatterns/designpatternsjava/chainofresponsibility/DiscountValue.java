package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountValue extends Discount {

    public DiscountValue() {
        super(new DiscountItems());
    }

    @Override
    protected boolean isValid(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal(500)) >= 0;
    }

    @Override
    protected BigDecimal doCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
