/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playon;

/**
 *
 * @author ian
 */
public abstract class AccountDecorator implements Account {
    
    protected Account decoratedAccount;
    
    public AccountDecorator(Account decoratedAccount){
        this.decoratedAccount = decoratedAccount;
        System.out.println("This is using Decorator");
    }
    
//    @Override
//    public void create(String accountName){
//        decoratedAccount.create(accountName);
//        System.out.println("This is using Decorator");
//    }
}
