package com.ppcompany.Domain;
/*
1.创建 banking 包
2. 在 banking 包下创建 Account 类。该类必须实现上述 UML 框图中的模型。
a. 声明一个私有对象属性:balance，这个属性保留了银行帐户的当前(或 即
时)余额。
b. 声明一个带有一个参数(init_balance)的公有构造器，这个参数为
balance 属性赋值。
c. 声明一个公有方法 getBalance，该方法用于获取账户余额。
d. 声明一个公有方法 deposit,该方法向当前余额增加金额。
e. 声明一个公有方法 withdraw 从当前余额中减去金额。
 */

import com.ppcompany.Exception.OverdraftException;

public class Account {
    //属性
    protected double balance = 0;

    //构造函数
    public Account(double init_balance){
        this.balance = init_balance;
    }

    //方法
    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
            balance += amt;
            return true;
    }

    public void withdraw(double amt) throws OverdraftException {
        double temp = balance - amt;
        if(temp >= 0){
            balance = temp;
        }else{
            throw new OverdraftException("资金不足", Math.abs(temp));
        }
    }
}
