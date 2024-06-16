package br.com.designpatterns.adapter;

import java.math.BigDecimal;

public class ClientFinancialOperationsJarAdapter {

    private final FinancialOperationsJarAdapter financialOperationsJarAdapter;

    public ClientFinancialOperationsJarAdapter(FinancialOperationsJarAdapter financialOperationsJarAdapter) {
        this.financialOperationsJarAdapter = financialOperationsJarAdapter;
    }


    public void withdraw(BigDecimal withdrawValue) {
        financialOperationsJarAdapter.withdraw(withdrawValue);
    }

    public void deposit(BigDecimal depositValue) {
        financialOperationsJarAdapter.deposit(depositValue);
    }
}
