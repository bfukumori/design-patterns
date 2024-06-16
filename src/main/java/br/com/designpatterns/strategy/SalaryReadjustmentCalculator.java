package br.com.designpatterns.strategy;

import java.math.BigDecimal;

public class SalaryReadjustmentCalculator {
    public void calculateSalary(Employee employee) {
        if (ContractType.CLT.name().equals(employee.getContractType().name())) {
            BigDecimal salary = employee.getSalary();
            employee.setSalary(salary.add(salary.multiply(new BigDecimal("0.1"))));
        } else if (ContractType.PJ.name().equals(employee.getContractType().name())) {
            BigDecimal salary = employee.getSalary();
            employee.setSalary(salary.add(salary.multiply(new BigDecimal("0.05"))));
        } else if (ContractType.TRAINEE.name().equals(employee.getContractType().name())) {
            BigDecimal salary = employee.getSalary();
            employee.setSalary(salary.add(salary.multiply(new BigDecimal("0.02"))));
        };
    }
}
