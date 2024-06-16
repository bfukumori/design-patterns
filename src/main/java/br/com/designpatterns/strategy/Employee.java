package br.com.designpatterns.strategy;

import lombok.*;

import java.math.BigDecimal;

@Data
@ToString
@Builder
public class Employee {
    private String name;
    private BigDecimal salary;
    private ContractType contractType;
}
