package com.ppcompany.Domain;
/*
1. 在banking包下的创建Customer类。该类必须实现上面的UML图表中的模
型。
a. 声明三个私有对象属性:firstName、lastName 和 account。
b. 声明一个公有构造器，这个构造器带有两个代表对象属性的参数(f 和 l)
c. 声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName
返 回相应的属性。
d. 声明 setAccount 方法来对 account 属性赋值。
e. 声明 getAccount 方法以获取 account 属性。
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private String firstName;
    private String lastName;
    // private Account account;
    // private Account[] account = new Account[5]; //账户的类型总数
    private ArrayList<Account> account = new ArrayList<>();
    // private int numberOfAccounts = 0; // 账户的编号

    public Customer(String fristName, String lastName){
        this.firstName = fristName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getNumberOfAccounts(){ return account.size(); }
//    public Account getAccount() {
//        return account;
//    }

//    public void setAccount(Account account) {
//        this.account = account;
//    }

    //addAccount是多态接口，具体传入的account是什么new的类型就是什么类型的account 1.SavingAccount 2.CheckingAccount
//    public void addAccount(Account acct){
//        this.account[this.getNumberOfAccounts()] = acct; // 传入某一种类型的account
//        numberOfAccounts++;
//    }
    public void addAccount(Account acct){
        account.add(acct);
    }

//    public Account getAccount(int acct_index){
//        return account[acct_index];
//    }

    public Account getAcctIndex(int acct_index){
        return account.get(acct_index);
    }

    public Iterator<Account> getAccount(){
        Iterator<Account> iterable_account = account.iterator();
        return iterable_account;
    }
}
