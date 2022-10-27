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
public class CreditAccount implements InterfaceBankAccount, InterfaceProfile{

    private int balance;
    private String name;
    
    @Override
    public void deposit(int amt) {
        this.balance += (amt - (amt*5/100));
    }

    @Override
    public void withdraw(int amt) {
        this.balance += amt;
    }

    @Override
    public int getBalance() {
        return balance;
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
