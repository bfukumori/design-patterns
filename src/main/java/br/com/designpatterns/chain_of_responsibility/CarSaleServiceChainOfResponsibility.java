package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class CarSaleServiceChainOfResponsibility {
    public BigDecimal calculateSalePrice(Car car) {
      var salePrice =new CardDiscountFIAT(new CardDiscountFORD(new CardDiscountValueOverOneHundredThousand(new NoDiscount(null))));

        return salePrice.applyDiscount(car);
    }
}
