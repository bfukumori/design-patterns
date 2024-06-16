package br.com.designpatterns.chain_of_responsibility;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@Builder
@ToString
public class Car {
    private String model;
    private Brand brand;
    BigDecimal price;
}
