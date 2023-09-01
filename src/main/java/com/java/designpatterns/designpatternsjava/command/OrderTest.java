package com.java.designpatterns.designpatternsjava.command;

import java.math.BigDecimal;

public class OrderTest {

    public static void main(String[] args) {
        var orderGenerator = new OrderGenerator("Client", new BigDecimal(100), 2);
        var handler = new OrderGeneratorHandler(orderGenerator);

        handler.generate();
    }
}
