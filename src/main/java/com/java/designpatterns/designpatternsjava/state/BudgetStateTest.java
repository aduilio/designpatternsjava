package com.java.designpatterns.designpatternsjava.state;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;
import com.java.designpatterns.designpatternsjava.chainofresponsibility.DiscountCalculator;

import java.math.BigDecimal;

public class BudgetStateTest {

    public static void main(String[] args) {
        var budgetToApprove = new Budget();
        budgetToApprove.approve();

        try {
            budgetToApprove.approve();
        } catch (RuntimeException exception) {
            System.out.println("Expected exception thrown.");
        }

        try {
            budgetToApprove.decline();
        } catch (RuntimeException exception) {
            System.out.println("Expected exception thrown.");
        }

        var budgetToDecline = new Budget();
        budgetToDecline.decline();

        try {
            budgetToDecline.decline();
        } catch (RuntimeException exception) {
            System.out.println("Expected exception thrown.");
        }

        try {
            budgetToDecline.approve();
        } catch (RuntimeException exception) {
            System.out.println("Expected exception thrown.");
        }
    }
}
