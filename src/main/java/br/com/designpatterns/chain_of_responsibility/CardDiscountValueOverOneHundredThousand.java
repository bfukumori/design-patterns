package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class CardDiscountValueOverOneHundredThousand extends   CarDiscount{

    public CardDiscountValueOverOneHundredThousand(CarDiscount nextDiscount) {
    super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal salePrice = car.getPrice();

        if (car.getPrice().compareTo(new BigDecimal(100000)) > 0) {
            return salePrice.subtract(new BigDecimal(10000));
        }

        return nextDiscount.applyDiscount(car);
    }
}
