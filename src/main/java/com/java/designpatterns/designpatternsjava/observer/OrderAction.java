package com.java.designpatterns.designpatternsjava.observer;

import com.java.designpatterns.designpatternsjava.command.Order;

public interface OrderAction {

    void execute(Order order);
}
