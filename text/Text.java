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
public class Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // error karena class abstrak
//        InterfaceBankAccount acc = new InterfaceBankAccount();
//          InterfaceBankAccount acc = new Account();
          InterfaceBankAccount acc = new CreditAccount();
          
          acc.deposit(2000000);
          acc.withdraw(500000);
          
          InterfaceProfile profile = new CreditAccount();
          profile.setName("John");
          
          System.out.println(acc.getBankName() + " " + acc.getBalance() + " " + profile.getName());
    }
    
}
