package com.java.designpatterns.designpatternsjava.strategy;

import java.math.BigDecimal;

public class TaxCalculator {

    BigDecimal calculate(BigDecimal value, Tax tax) {
        return tax.calculate(value);
    }
}
