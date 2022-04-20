package com.ppcompany.Domain;

public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(double balance, double interest_Rate){
        super(balance);
        interestRate = interest_Rate;
    }
}
