package com.java.designpatterns.designpatternsjava.decorator;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

import java.math.BigDecimal;

public abstract class Tax {

    private Tax other;

    public Tax(Tax other) {
        this.other = other;
    }

    public BigDecimal calculate(Budget budget) {
        var taxValue = getTax(budget.getValue());
        var otherValue = BigDecimal.ZERO;

        if (other != null) {
            otherValue = other.getTax(budget.getValue());
        }

        return taxValue.add(otherValue);
    }

    protected abstract BigDecimal getTax(BigDecimal value);
}
