package com.java.designpatterns.designpatternsjava.strategy;

import java.math.BigDecimal;

public class TaxCalculatorTest {

    public static void main(String[] args) {
        var taxCalculator = new TaxCalculator();

        // must return 10
        System.out.println(taxCalculator.calculate(new BigDecimal("100"), new Tax1()));

        // must return 20
        System.out.println(taxCalculator.calculate(new BigDecimal("100"), new Tax2()));
    }
}
