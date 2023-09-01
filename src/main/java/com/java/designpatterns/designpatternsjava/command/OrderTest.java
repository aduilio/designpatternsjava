package com.java.designpatterns.designpatternsjava.command;

import com.java.designpatterns.designpatternsjava.observer.SaveOrder;
import com.java.designpatterns.designpatternsjava.observer.SendEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTest {

    public static void main(String[] args) {
        var orderGenerator = new OrderGenerator("Client", new BigDecimal(100), 2);
        var handler = new OrderGeneratorHandler(orderGenerator, Arrays.asList(new SaveOrder(), new SendEmail()));

        handler.generate();
    }
}
