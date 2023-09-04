package com.java.designpatterns.designpatternsjava.state;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public abstract class BudgetState {

    public void approve(Budget budget) {
        throw new RuntimeException("Budget cannot be approved");
    }

    public void decline(Budget budget) {
        throw new RuntimeException("Budget cannot be declined");
    }

    public void close(Budget budget) {
        throw new RuntimeException("Budget cannot be closed");
    }
}
