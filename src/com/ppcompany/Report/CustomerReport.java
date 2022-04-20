package com.ppcompany.Report;

import com.ppcompany.Domain.*;

import java.util.Iterator;

public class CustomerReport {
    //声明对象
    Bank bank = Bank.getBank();
    Customer curCustomer;

    //构造函数
    public CustomerReport(){ }

    //generateReport()方法
    public void generateReport(){
        //标题
        System.out.println("CUSTOMER REPORT");
        System.out.println("=======================");

//        for(int customer_id = 0; customer_id < bank.getNumOfCustomers(); customer_id++){
//            // 获取当前客户
//            curCustomer = bank.getCustomer(customer_id);
//
//            // 信息打印
//            System.out.println("Customer:" + curCustomer.getLastName() + "," + curCustomer.getFirstName());
//
//            for(int account_id = 0; account_id < curCustomer.getNumberOfAccounts(); account_id++){
//                // 获取当前账户
//                Account curAccount = curCustomer.getAccount(account_id);
//                // 初始化
//                String account_type = "";
//
//                if(curAccount instanceof SavingAccount){
//                    account_type = "Savings Account";
//                }
//                if(curAccount instanceof CheckingAccount){
//                    account_type = "Checking Account";
//                }
//                System.out.println("    " + account_type + ":current balance is " + curAccount.getBalance());
//            }
        // 生成Customer的迭代器
        Iterator<Customer> itCustomer = bank.getCustomer();
        while(itCustomer.hasNext()){
            // 获取当前对象
            curCustomer = itCustomer.next();

            // 信息打印
            System.out.println("Customer:" + curCustomer.getLastName() + "," + curCustomer.getFirstName());

            // 生成Account的迭代器
            Iterator<Account> itAccount = curCustomer.getAccount();
            while(itAccount.hasNext()){
                // 获取当前账户
                Account curAccount = itAccount.next();
                // 初始化
                String account_type = "";

                if(curAccount instanceof SavingAccount){
                    account_type = "Savings Account";
                }
                if(curAccount instanceof CheckingAccount){
                    account_type = "Checking Account";
                }
                System.out.println("    " + account_type + ":current balance is " + curAccount.getBalance());
            }
            System.out.println(" ");
        }
    }
}
