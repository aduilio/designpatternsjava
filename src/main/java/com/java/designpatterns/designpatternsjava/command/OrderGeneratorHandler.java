package com.java.designpatterns.designpatternsjava.command;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;
import com.java.designpatterns.designpatternsjava.observer.OrderAction;

import java.util.List;

public class OrderGeneratorHandler {

    //dependency injection of the services

    private OrderGenerator orderGenerator;

    private List<OrderAction> actions;

    public OrderGeneratorHandler(OrderGenerator orderGenerator,
                                 List<OrderAction> actions) {
        this.orderGenerator = orderGenerator;
        this.actions = actions;
    }

    public void generate() {
        var budget = new Budget(this.orderGenerator.getItems(), this.orderGenerator.getValue());
        Order order = new Order(this.orderGenerator.getClient(), budget);

        actions.forEach(action -> action.execute(order));
    }
}
