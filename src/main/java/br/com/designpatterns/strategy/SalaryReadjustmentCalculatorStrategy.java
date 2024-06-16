package br.com.designpatterns.strategy;

import java.math.BigDecimal;

public class SalaryReadjustmentCalculatorStrategy {
    public void calculateSalary(Employee employee, ISalaryReadjustmentCalculator salaryReadjustmentCalculator) {
        salaryReadjustmentCalculator.calculateSalary(employee);
    }
}
