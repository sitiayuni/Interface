/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author LENOVO
 */
public class Account implements InterfaceBankAccount, InterfaceProfile{
    private int Balance;
    private String name;
    
    @Override
    public void deposit(int amt) {
       this.Balance += amt;
    }

    @Override
    public void withdraw(int amt) {
        this.Balance -= amt;
    }

    @Override
    public int getBalance() {
        return Balance;
    }

    @Override
    public String getBankName() {
        return BANK;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
