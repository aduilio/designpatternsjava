package com.java.designpatterns.designpatternsjava.observer;

import com.java.designpatterns.designpatternsjava.command.Order;

public class SendEmail implements OrderAction {

    @Deprecated
    public void execute(Order order) {
        System.out.println("Send e-mail to the client");
    }
}
