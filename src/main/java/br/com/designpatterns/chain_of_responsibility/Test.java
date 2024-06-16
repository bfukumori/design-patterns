package br.com.designpatterns.chain_of_responsibility;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        CarSaleService carSaleService = new CarSaleService();
        CarSaleServiceChainOfResponsibility carSaleServiceChainOfResponsibility = new CarSaleServiceChainOfResponsibility();

        var car1 = new Car.CarBuilder().brand(Brand.FORD).model("Fusion").price(new BigDecimal(90000)).build();
        var car2 = new Car.CarBuilder().brand(Brand.FIAT).model("Uno").price(new BigDecimal(40000)).build();
        var car3 = new Car.CarBuilder().brand(Brand.CHEVROLET).model("Camaro").price(new BigDecimal(200000)).build();

        System.out.println("\n Without Chain of Responsability");
        var costWithDiscountCar1 = carSaleService.calculateSalePrice(car1);
        var costWithDiscountCar2 = carSaleService.calculateSalePrice(car2);
        var costWithDiscountCar3 = carSaleService.calculateSalePrice(car3);


        System.out.println("\n### FUSION ###");
        System.out.println("Original cost: " + car1.getPrice());
        System.out.println("Cost with discount: " + costWithDiscountCar1);


        System.out.println("\n### FIAT ###");
        System.out.println("Original cost: " + car2.getPrice());
        System.out.println("Cost with discount: " + costWithDiscountCar2);


        System.out.println("\n### CHEVROLET ###");
        System.out.println("Original cost: " + car3.getPrice());
        System.out.println("Cost with discount: " + costWithDiscountCar3);

        System.out.println("\n With Chain of Responsability");
        var costWithDiscountCar4 = carSaleServiceChainOfResponsibility.calculateSalePrice(car1);
        var costWithDiscountCar5 = carSaleServiceChainOfResponsibility.calculateSalePrice(car2);
        var costWithDiscountCar6 = carSaleServiceChainOfResponsibility.calculateSalePrice(car3);

        System.out.println("\n### FUSION ###");
        System.out.println("Original cost: " + car1.getPrice());
        System.out.println("Cost with discount: " + costWithDiscountCar4);


        System.out.println("\n### FIAT ###");
        System.out.println("Original cost: " + car2.getPrice());
        System.out.println("Cost with discount: " + costWithDiscountCar5);


        System.out.println("\n### CHEVROLET ###");
        System.out.println("Original cost: " + car3.getPrice());
        System.out.println("Cost with discount: " + costWithDiscountCar6);
    }
}
