package com.java.designpatterns.designpatternsjava.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BudgetComposite implements Budgetable {

    private BigDecimal value;
    private List<Budgetable> items;

    public BudgetComposite() {
        value = BigDecimal.ZERO;
        items = new ArrayList<>();
    }

    public void addItems(Budgetable item) {
        items.add(item);
        value = value.add(item.getValue());
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    public List<Budgetable> getItems() {
        return items;
    }
}
