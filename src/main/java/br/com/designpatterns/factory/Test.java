package br.com.designpatterns.factory;

public class Test {
    public static void main(String[] args) {
        var product = ProductFactory.getInstance(ProductType.PHYSICAL);
        product.setName("Livro");
        product.setDescription("História fictícia da Terra-Média");
        product.setPrice(99.90);

        var product2 = ProductFactory.getInstance(ProductType.DIGITAL);
        product2.setName("E-book");
        product2.setDescription("Contos Inacabados");
        product2.setPrice(29.90);

        System.out.println("Produto Físico: " + product);
        System.out.println("Produto Digital: " + product2);
    }
}
