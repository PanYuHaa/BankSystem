package com.ppcompany.Domain;

public class CheckingAccount extends Account{
    private double overdraftProtection;

    // 没有余额透支的对象
    public CheckingAccount(double balance) {
        super(balance);
    }

    // 有余额透支的对象
    public CheckingAccount(double balance, double protect){
        super(balance);
        this.overdraftProtection = protect;
    }

    //多态-重写withdraw
    //半残品test中 没用到暂且不用写
    public void withdraw(double amt){
        double difference = balance - amt;
        if(difference >= 0){
            balance -= amt;
        }
        if(difference < 0 && difference + overdraftProtection >= 0){
            balance = 0;
        }else{

        }
    }
}
