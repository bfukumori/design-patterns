package br.com.designpatterns.factory;

import lombok.Data;

@Data
public abstract class Product {
    private double price;
    private String name;
    private String description;
    private boolean hasDimensions;
}
