package com.java.designpatterns.designpatternsjava.adapter;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public class BudgetRecordTest {

    public static void main(String[] args) {
        var budgetRecord = new BudgetRecord(new JavaHttpClient());
        var budget = new Budget();
        budget.approve();
        budget.close();

        budgetRecord.record(budget);
    }
}
