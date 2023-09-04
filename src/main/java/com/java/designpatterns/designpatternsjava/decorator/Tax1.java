package com.java.designpatterns.designpatternsjava.decorator;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

import java.math.BigDecimal;

public class Tax1 extends Tax {
    public Tax1(Tax other) {
        super(other);
    }

    @Override
    protected BigDecimal getTax(BigDecimal value) {
        return value.multiply(new BigDecimal("0.1"));
    }
}
