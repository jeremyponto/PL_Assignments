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
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
        account = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        if(account == null) {
            account = acct;
        } else {
            System.out.println("Account has been created!");
        }
    }
}
