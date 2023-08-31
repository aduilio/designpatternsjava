package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountZero extends Discount {

    public DiscountZero() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }
}
