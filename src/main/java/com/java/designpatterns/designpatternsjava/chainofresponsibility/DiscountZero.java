package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountZero extends Discount {

    public DiscountZero() {
        super(null);
    }

    @Override
    protected boolean isValid(Budget budget) {
        return true;
    }

    @Override
    protected BigDecimal doCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }
}
