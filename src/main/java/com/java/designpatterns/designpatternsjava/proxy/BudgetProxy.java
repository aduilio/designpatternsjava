package com.java.designpatterns.designpatternsjava.proxy;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;
import com.java.designpatterns.designpatternsjava.composite.Budgetable;

import java.math.BigDecimal;

public class BudgetProxy implements Budgetable {

    private Budget budget;
    private BigDecimal value;

    public BudgetProxy(Budget budget) {
        this.budget = budget;
    }

    @Override
    public BigDecimal getValue() {
        if (value == null) {
            value = budget.getValue();
        }

        return value;
    }
}
