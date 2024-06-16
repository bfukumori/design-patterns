package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class CarSaleService {
    public BigDecimal calculateSalePrice(Car car) {
        BigDecimal salePrice = car.getPrice();

        if (Brand.FIAT.equals(car.getBrand())) {
            return salePrice.subtract(new BigDecimal(1000));
        }

        if (Brand.FORD.equals(car.getBrand())) {
            return salePrice.subtract(new BigDecimal(2000));
        }

        if ( car.getPrice().compareTo(new BigDecimal(100000)) > 0) {
            return salePrice.subtract(new BigDecimal(10000));
        }

        return salePrice;
    }
}
