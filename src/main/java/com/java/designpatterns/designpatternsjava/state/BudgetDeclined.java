package com.java.designpatterns.designpatternsjava.state;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public class BudgetDeclined extends BudgetState {

    @Override
    public void close(Budget budget) {
        budget.setState(new BudgetClosed());
    }
}
