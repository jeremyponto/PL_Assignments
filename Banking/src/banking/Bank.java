/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.*;

/**
 *
 * @author user
 */
public class Bank {
    private ArrayList<Customer> customers;
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName) {
        bankName = bName;
        numberOfCustomers = 0;
        customers = new ArrayList<Customer>();
    }
    
    public void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }
    
    public Customer getCustomer(int index) {
        return customers.get(index);
    }
}
