package br.com.designpatterns.adapter;

import java.math.BigDecimal;

public class TestAdapter {

    public static void main(String[] args) {

        FinancialOperationsJar financialOperationsJar = new FinancialOperationsJar();
        FinancialOperationsJarAdapter financialOperationsJarAdapter = new FinancialOperationsJarAdapter(financialOperationsJar);
        ClientFinancialOperationsJarAdapter clientAdapter = new ClientFinancialOperationsJarAdapter(financialOperationsJarAdapter);

        BigDecimal withdrawValue = new BigDecimal(1000);

        clientAdapter.withdraw(withdrawValue);

        clientAdapter.deposit(new BigDecimal(500));
    }
}
