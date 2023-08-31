package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import com.java.designpatterns.designpatternsjava.strategy.Tax1;
import com.java.designpatterns.designpatternsjava.strategy.Tax2;
import com.java.designpatterns.designpatternsjava.strategy.TaxCalculator;

import java.math.BigDecimal;

public class DiscountCalculatorTest {

    public static void main(String[] args) {
        var discountCalculator = new DiscountCalculator();

        var budget = new Budget();

        budget.setItems(4);
        budget.setValue(new BigDecimal(500));

        // must return 50
        System.out.println(discountCalculator.calculate(budget));

        budget.setItems(5);
        budget.setValue(new BigDecimal(200));

        // must return 10
        System.out.println(discountCalculator.calculate(budget));

        budget.setItems(2);
        budget.setValue(new BigDecimal(100));

        // must return 0
        System.out.println(discountCalculator.calculate(budget));
    }
}
