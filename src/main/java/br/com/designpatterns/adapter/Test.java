package br.com.designpatterns.adapter;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        FinancialOperationsJar financialOperationsJar = new FinancialOperationsJar();
       ClientFinancialOperationsJar client = new ClientFinancialOperationsJar(financialOperationsJar);

       BigDecimal withdrawValue = new BigDecimal(1000);

       if (client.checkBalance(withdrawValue)) {
           client.withdraw(withdrawValue);
       }

       client.deposit(new BigDecimal(500));
    }
}
