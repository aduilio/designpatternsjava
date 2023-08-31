package com.java.designpatterns.designpatternsjava.chainofresponsibility;

import com.java.designpatterns.designpatternsjava.state.BudgetOpen;
import com.java.designpatterns.designpatternsjava.state.BudgetState;

import java.math.BigDecimal;

public class Budget {

    private int items;
    private BigDecimal value;

    private BudgetState state = new BudgetOpen();

    public void approve() {
        state.approve(this);
    }

    public void decline() {
        state.decline(this);
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BudgetState getState() {
        return state;
    }

    public void setState(BudgetState state) {
        this.state = state;
    }
}
