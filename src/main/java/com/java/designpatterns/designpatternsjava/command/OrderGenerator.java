package com.java.designpatterns.designpatternsjava.command;

import java.math.BigDecimal;

public class OrderGenerator {

    private String client;
    private BigDecimal value;
    private int items;

    public OrderGenerator(String client, BigDecimal value, int items) {
        this.client = client;
        this.value = value;
        this.items = items;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItems() {
        return items;
    }
}
