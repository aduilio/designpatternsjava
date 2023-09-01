package com.java.designpatterns.designpatternsjava.command;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

import java.time.LocalDateTime;

public class Order {

    private String client;
    private LocalDateTime date = LocalDateTime.now();
    private Budget budget;

    public Order(String client, Budget budget) {
        this.client = client;
        this.budget = budget;
    }
}
