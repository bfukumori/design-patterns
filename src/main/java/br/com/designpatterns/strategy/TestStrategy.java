package br.com.designpatterns.strategy;

import java.math.BigDecimal;

public class TestStrategy {

    public static void main(String[] args) {
        SalaryReadjustmentCalculatorStrategy salaryReadjustmentCalculatorStrategy = new SalaryReadjustmentCalculatorStrategy();

        Employee employeeCLT = new Employee.EmployeeBuilder().contractType(ContractType.CLT).name("John Doe").salary(new BigDecimal(10000)).build();
        Employee employeePJ = new Employee.EmployeeBuilder().contractType(ContractType.PJ).name("Kelly Clark").salary(new BigDecimal(20000)).build();
        Employee employeeTRAINEE = new Employee.EmployeeBuilder().contractType(ContractType.TRAINEE).name("Denzel Washington").salary(new BigDecimal(5000)).build();



    }
}
