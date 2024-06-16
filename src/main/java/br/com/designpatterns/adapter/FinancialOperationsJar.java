package br.com.designpatterns.adapter;

import java.math.BigDecimal;

public class FinancialOperationsJar {

    public boolean checkBalance(BigDecimal withdrawValue) {
        System.out.println("Validating withdraw value...");
        return false;
    }

    public void withdraw(BigDecimal withdrawValue) {
        System.out.println("Withdrawing...");
    }

    public void deposit(BigDecimal depositValue) {
        System.out.println("Depositing...");
    }
}
