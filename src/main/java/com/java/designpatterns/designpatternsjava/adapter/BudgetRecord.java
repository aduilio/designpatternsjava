package com.java.designpatterns.designpatternsjava.adapter;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;
import com.java.designpatterns.designpatternsjava.state.BudgetClosed;

public class BudgetRecord {

    private HttpAdapter httpAdapter;

    public BudgetRecord(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void record(Budget budget) {
        if (!(budget.getState() instanceof BudgetClosed)) {
            throw new RuntimeException("Budget cannot be recorded");
        }

        httpAdapter.post(budget);
    }
}
