package com.dov.cesi.singleton;

import java.util.Date;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;

    public BankAccount(int accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount){
        setAccountBalance(getAccountBalance()+ amount);
        DailyLogs.getInstance().addLog(new Date().toString()+" dépôt de "+amount+ " sur le compte numéro "+ getAccountNumber());
    }

    public void withdraw(double amount){
        setAccountBalance(getAccountBalance()- amount);
        DailyLogs.getInstance().addLog(new Date().toString()+ " retrait de "+amount+ " sur le compte numéro "+ getAccountNumber());
    }
}
