package com.java.designpatterns.designpatternsjava.adapter;

import com.java.designpatterns.designpatternsjava.chainofresponsibility.Budget;

public class JavaHttpClient implements HttpAdapter {

    // dependency injection

    @Override
    public void post(Budget budget) {
        System.out.println("Sending post request.");
    }
}
