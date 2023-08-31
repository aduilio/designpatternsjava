package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import com.java.designpatterns.designpatternsjava.strategy.Tax;

import java.math.BigDecimal;

public class DiscountCalculator {

    BigDecimal calculate(Budget budget) {
        return new DiscountValue().calculate(budget);
    }
}
