package com.java.designpatterns.designpatternsjava.strategy;

import java.math.BigDecimal;

public class Tax2 implements Tax {
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(new BigDecimal("0.2"));
    }
}
