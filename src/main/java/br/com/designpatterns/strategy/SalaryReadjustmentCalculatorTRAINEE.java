package br.com.designpatterns.strategy;

import java.math.BigDecimal;

public class SalaryReadjustmentCalculatorTRAINEE implements  ISalaryReadjustmentCalculator {

    @Override
    public void calculateSalary(Employee employee) {
        BigDecimal salary = employee.getSalary();
        employee.setSalary(salary.add(salary.multiply(new BigDecimal("0.02"))));
    }
}
