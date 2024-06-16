package br.com.designpatterns.adapter;

import java.math.BigDecimal;

public class ClientFinancialOperationsJar {

    private final FinancialOperationsJar financialOperationsJar;

    public ClientFinancialOperationsJar(FinancialOperationsJar financialOperationsJar) {
        this.financialOperationsJar = new FinancialOperationsJar();
    }

    public boolean checkBalance(BigDecimal withdrawValue) {
        return financialOperationsJar.checkBalance(withdrawValue);
    }

    public void withdraw(BigDecimal withdrawValue) {
        financialOperationsJar.withdraw(withdrawValue);
    }

    public void deposit(BigDecimal depositValue) {
        financialOperationsJar.deposit(depositValue);
    }
}
