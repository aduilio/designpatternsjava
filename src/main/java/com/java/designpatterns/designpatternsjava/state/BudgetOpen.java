package com.java.designpatterns.designpatternsjava.state;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public class BudgetOpen extends BudgetState {

    @Override
    public void approve(Budget budget) {
        budget.setState(new BudgetApproved());
    }

    @Override
    public void decline(Budget budget) {
        budget.setState(new BudgetDeclined());
    }
}
