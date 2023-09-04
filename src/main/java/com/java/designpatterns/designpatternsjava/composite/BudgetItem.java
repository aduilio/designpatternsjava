package com.java.designpatterns.designpatternsjava.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BudgetItem implements Budgetable {

    private BigDecimal value;

    public BudgetItem(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }
}
