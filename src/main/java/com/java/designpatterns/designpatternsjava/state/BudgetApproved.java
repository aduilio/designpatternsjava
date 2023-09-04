package com.java.designpatterns.designpatternsjava.state;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public class BudgetApproved extends BudgetState {

    @Override
    public void close(Budget budget) {
        budget.setState(new BudgetClosed());
    }
}
