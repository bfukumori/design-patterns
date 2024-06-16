package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class CardDiscountFORD extends   CarDiscount{

    public CardDiscountFORD(CarDiscount nextDiscount) {
    super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal salePrice = car.getPrice();

        if (Brand.FORD.equals(car.getBrand())) {
            return salePrice.subtract(new BigDecimal(2000));
        }

        return nextDiscount.applyDiscount(car);
    }
}
