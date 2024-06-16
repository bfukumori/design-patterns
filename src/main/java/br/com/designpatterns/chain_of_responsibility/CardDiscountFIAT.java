package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class CardDiscountFIAT extends   CarDiscount{

    public CardDiscountFIAT(CarDiscount nextDiscount) {
    super(nextDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        BigDecimal salePrice = car.getPrice();

        if (Brand.FIAT.equals(car.getBrand())) {
            return salePrice.subtract(new BigDecimal(1000));
        }

        return nextDiscount.applyDiscount(car);
    }
}
