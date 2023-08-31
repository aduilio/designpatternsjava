package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import java.math.BigDecimal;

public abstract class Discount {

    private Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if (isValid(budget)) {
            return doCalculation(budget);
        }

        return next.calculate(budget);
    }

    protected abstract boolean isValid(Budget budget);

    protected abstract BigDecimal doCalculation(Budget budget);
}
