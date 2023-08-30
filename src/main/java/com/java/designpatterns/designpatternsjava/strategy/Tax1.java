package com.java.designpatterns.designpatternsjava.strategy;

import java.math.BigDecimal;

public class Tax1 implements Tax {
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(new BigDecimal("0.1"));
    }
}
