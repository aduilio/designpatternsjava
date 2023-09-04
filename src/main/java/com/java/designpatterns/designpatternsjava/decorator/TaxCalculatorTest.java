package com.java.designpatterns.designpatternsjava.decorator;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

import java.math.BigDecimal;

public class TaxCalculatorTest {

    public static void main(String[] args) {
        var taxCalculator = new TaxCalculator();

        var budget = new Budget(1, new BigDecimal("100"));

        // must return 30
        System.out.println(taxCalculator.calculate(budget, new Tax1(new Tax2(null))));
    }
}
