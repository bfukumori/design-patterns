package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public abstract class CarDiscount {
    protected CarDiscount nextDiscount;

    CarDiscount(CarDiscount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public abstract BigDecimal applyDiscount(Car car);
}
