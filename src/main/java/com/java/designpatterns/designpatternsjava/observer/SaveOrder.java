package com.java.designpatterns.designpatternsjava.observer;

import com.java.designpatterns.designpatternsjava.command.Order;

public class SaveOrder implements OrderAction {

    @Override
    public void execute(Order order) {
        System.out.println("Save in the database");
    }
}
