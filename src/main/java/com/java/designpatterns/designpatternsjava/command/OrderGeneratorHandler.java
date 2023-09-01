package com.java.designpatterns.designpatternsjava.command;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public class OrderGeneratorHandler {

    //dependency injection of the services

    private OrderGenerator orderGenerator;

    public OrderGeneratorHandler(OrderGenerator orderGenerator) {
        this.orderGenerator = orderGenerator;
    }

    public void generate() {
        var budget = new Budget(this.orderGenerator.getItems(), this.orderGenerator.getValue());
        Order order = new Order(this.orderGenerator.getClient(), budget);

        System.out.println("Save in the database");
        System.out.println("Send e-mail to the client");
        System.out.println("Update stock information");
    }
}
