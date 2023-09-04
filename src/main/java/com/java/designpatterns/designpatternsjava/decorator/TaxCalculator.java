package com.java.designpatterns.designpatternsjava.decorator;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;
import com.java.designpatterns.designpatternsjava.decorator.Tax;

import java.math.BigDecimal;

public class TaxCalculator {

    BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
