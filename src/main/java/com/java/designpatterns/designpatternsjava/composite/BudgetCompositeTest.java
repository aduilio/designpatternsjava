package com.java.designpatterns.designpatternsjava.composite;

import java.math.BigDecimal;

public class BudgetCompositeTest {

    public static void main(String[] args) {
        var oldBudget = new BudgetComposite();
        oldBudget.addItems(new BudgetItem(new BigDecimal(100)));

        var newBudget = new BudgetComposite();
        newBudget.addItems(new BudgetItem(new BigDecimal(50)));
        newBudget.addItems(oldBudget);

        // must return 150
        System.out.println(newBudget.getValue());
    }
}
