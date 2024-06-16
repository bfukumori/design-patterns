package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class NoDiscount extends   CarDiscount{

    public NoDiscount(CarDiscount nextDiscount) {
    super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
       return BigDecimal.ZERO;
    }
}
