package com.ppcompany.Domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();
    // private int numberOfCustomers = 0;
    private static Bank bank = new Bank(); // 懒汉式先创建对象

    private Bank(){
    }

    public static Bank getBank(){
        return bank;
    }

//    public void addCustomer(String f, String l){
//        customers[numberOfCustomers] = new Customer(f, l); //new一个customer加入到customers数组中
//        numberOfCustomers++;
//    }
    public void addCustomer(String f, String l){
        customers.add(new Customer(f, l));
    }

    public int getNumOfCustomers(){
        return customers.size();
    }

//    public Customer getCustomer(int index){
//        return customers[index];
//    }

    public Customer getCustIndex(int index){
        return customers.get(index);
    }

    public Iterator<Customer> getCustomer(){
        Iterator<Customer> iterator_customer = customers.iterator();
        return iterator_customer;
    }
}
