package br.com.designpatterns.factory;

public class ProductFactory {

    public static Product getInstance(ProductType type) {
        switch (type) {
            case PHYSICAL:
                var physical = new DigitalProduct();
                physical.setHasDimensions(true);
                return physical;
            case DIGITAL:
                var digital = new DigitalProduct();
                digital.setHasDimensions(false);
                return digital;
            default:
                throw new IllegalArgumentException("Invalid product type");

        }
    }
}
