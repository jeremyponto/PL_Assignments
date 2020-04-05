/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author user
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        if(init_balance < 0.0) {
            balance = 0.0;
        } else {
            balance = init_balance;
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt) {
        balance += amt;
        
        return true;
    }
    
    public boolean withdraw(double amt) {
        if(amt > balance) {
            System.out.println("Amount exceeded balance!");
            
            return false;
        } else {
            balance -= amt;
            
            return true;
        }
    }
}
