package br.com.designpatterns.adapter;

import java.math.BigDecimal;

public class FinancialOperationsJarAdapter {
    private final FinancialOperationsJar financialOperationsJar;

    FinancialOperationsJarAdapter(FinancialOperationsJar financialOperationsJar) {
        this.financialOperationsJar = financialOperationsJar;
    }

    public void withdraw(BigDecimal withdrawValue) {
        if (financialOperationsJar.checkBalance(withdrawValue)) {
            financialOperationsJar.withdraw(withdrawValue);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public void deposit(BigDecimal depositValue) {
        System.out.println("Depositing...");
    }
}
