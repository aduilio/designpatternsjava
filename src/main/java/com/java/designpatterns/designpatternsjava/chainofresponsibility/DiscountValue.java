package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountValue extends Discount {

    public DiscountValue() {
        super(new DiscountItems());
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal(500)) >= 0) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(budget);
    }
}
