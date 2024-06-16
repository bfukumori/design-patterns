package br.com.designpatterns.strategy;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        SalaryReadjustmentCalculator salaryReadjustmentCalculator = new SalaryReadjustmentCalculator();
        SalaryReadjustmentCalculatorStrategy salaryReadjustmentCalculatorStrategy = new SalaryReadjustmentCalculatorStrategy();

        var employeeCLT = new Employee.EmployeeBuilder().contractType(ContractType.CLT).name("John Doe").salary(new BigDecimal(10000)).build();
        var employeePJ = new Employee.EmployeeBuilder().contractType(ContractType.PJ).name("Kelly Clark").salary(new BigDecimal(20000)).build();
        var employeeTRAINEE = new Employee.EmployeeBuilder().contractType(ContractType.TRAINEE).name("Denzel Washington").salary(new BigDecimal(5000)).build();

        System.out.println("\n##### Calculate Salary #####");
        salaryReadjustmentCalculator.calculateSalary(employeeCLT);
        salaryReadjustmentCalculator.calculateSalary(employeePJ);
        salaryReadjustmentCalculator.calculateSalary(employeeTRAINEE);

        System.out.println("CLT: " + employeeCLT);
        System.out.println("PJ: " + employeePJ);
        System.out.println("TRAINEE: " + employeeTRAINEE);

        System.out.println("\n##### Calculate Salary with Strategy Pattern #####");
        salaryReadjustmentCalculatorStrategy.calculateSalary(employeeCLT, new SalaryReadjustmentCalculatorCLT());
        salaryReadjustmentCalculatorStrategy.calculateSalary(employeePJ, new SalaryReadjustmentCalculatorPJ());
        salaryReadjustmentCalculatorStrategy.calculateSalary(employeeTRAINEE, new SalaryReadjustmentCalculatorTRAINEE());

        System.out.println("CLT: " + employeeCLT);
        System.out.println("PJ: " + employeePJ);
        System.out.println("TRAINEE: " + employeeTRAINEE);

    }
}
