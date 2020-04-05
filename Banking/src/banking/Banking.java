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
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account a1 = new Account(-1000000.0);
        Account a2 = new Account(1000000.0);
        
        System.out.println("Account a1 balance : " + a1.getBalance());
        System.out.println("Account a2 balance : " + a2.getBalance());
        
        System.out.println("Account a1 deposit status : " + a1.deposit(1000000.0));
        System.out.println("Account a2 deposit status : " + a2.deposit(1000000.0));
        
        System.out.println("Account a1 balance : " + a1.getBalance());
        System.out.println("Account a2 balance : " + a2.getBalance());
        
        System.out.println("Account a1 withdraw status : " + a1.withdraw(5000000.0));
        System.out.println("Account a2 withdraw status : " + a2.withdraw(1000000.0));
        
        System.out.println("Account a1 balance : " + a1.getBalance());
        System.out.println("Account a2 balance : " + a2.getBalance());
        
        Bank b1 = new Bank("DBS");
        
        b1.addCustomer("Jeremy", "Ponto");
        b1.addCustomer("Jeanet", "Ponto");
        
        System.out.println("Bank b1 customers : " + b1.getNumOfCustomers());
        
        System.out.println("Bank b1 customer number 1 : " + b1.getCustomer(0).getFirstName() + " " + b1.getCustomer(0).getLastName());
        System.out.println("Bank b1 customer number 2 : " + b1.getCustomer(1).getFirstName() + " " + b1.getCustomer(1).getLastName());
        
        System.out.println("Bank b1 customer number 1 account : " + b1.getCustomer(0).getAccount());
        System.out.println("Bank b1 customer number 2 account : " + b1.getCustomer(1).getAccount());
        
        b1.getCustomer(0).setAccount(a1);
        b1.getCustomer(1).setAccount(a2);
        b1.getCustomer(0).setAccount(a2);
        b1.getCustomer(1).setAccount(a1);
        
        System.out.println("Bank b1 customer number 1 account balance : " + b1.getCustomer(0).getAccount().getBalance());
        System.out.println("Bank b1 customer number 2 account balance : " + b1.getCustomer(1).getAccount().getBalance());
    }
    
}
