package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public class DiscountItems extends Discount {

    public DiscountItems() {
        super(new DiscountZero());
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if (budget.getItems() >= 5) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return next.calculate(budget);
    }
}
