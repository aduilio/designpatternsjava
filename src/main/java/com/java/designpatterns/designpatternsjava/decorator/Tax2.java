package com.java.designpatterns.designpatternsjava.decorator;

import java.math.BigDecimal;

public class Tax2 extends Tax {
    public Tax2(Tax other) {
        super(other);
    }

    @Override
    protected BigDecimal getTax(BigDecimal value) {
        return value.multiply(new BigDecimal("0.2"));
    }
}
