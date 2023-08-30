package com.java.designpatterns.designpatternsjava.strategy;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(BigDecimal value);
}
