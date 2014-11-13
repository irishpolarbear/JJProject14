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
public class PlayOn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account tomRegularAccount = new RegularAccount();
        
        Account alanRegularAccount2 = new RegularAccount();
        
        Account ianPremiumAccount = new PremiumAccountDecorator(new RegularAccount());
        
        
        
        tomRegularAccount.create("Tom");
        alanRegularAccount2.create("Alan");
        ianPremiumAccount.create("Ian");
        tomRegularAccount.getProfiles();
        ianPremiumAccount.getProfiles();
        tomRegularAccount.addProfile("sillyBilly");
        tomRegularAccount.addProfile("FuckJJ");
        ianPremiumAccount.addProfile("Alan Smells");
        ianPremiumAccount.addProfile("Alans a dick");
        ianPremiumAccount.addProfile("Alan has a tiny penis");        
        Account tomPremiumAccount = new PremiumAccountDecorator(tomRegularAccount);
        tomPremiumAccount.create("Tom new");
        tomPremiumAccount.getProfiles();
        ianPremiumAccount.getProfiles();
        
    }
    
}
