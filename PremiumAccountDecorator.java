/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playon;

import java.util.ArrayList;

/**
 *
 * @author ian
 */
public class PremiumAccountDecorator extends AccountDecorator{
    
    private ArrayList<ProfileOriginator> profiles;    
    private String accountName;    
    private final String accountType = "Premium Account";
    
    public PremiumAccountDecorator(Account decoratedAccount){
        super(decoratedAccount);
    }    
    
    @Override
    public void create(String accountName){
        this.accountName = accountName;
        decoratedAccount.create(accountName);
        profiles = new ArrayList<ProfileOriginator>();
        upgradeToPremium(decoratedAccount);   
        System.out.println("Premium Decorator called.");
        System.out.println(accountName+" has been upgraded to Premium");
    }
    
    @Override
    public void addProfile(String username){         
       // ProfileOriginator profile1 = new ProfileOriginator(username);
        this.profiles.add(new ProfileOriginator(username));
        System.out.println("Account: " + accountName + " added new Profile: " + username);        
    }
    
    @Override
    public void getProfiles(){
        
        if(this.profiles==null){
            System.out.println("Account Name: " + accountName + " has no Profiles added");
        }
        else{
            for(ProfileOriginator profile:profiles)
            {
                System.out.println(profile);  
            }
        }
    }
    
    private void upgradeToPremium(Account decoratedAccount){
        System.out.println("Updating....");
    }
    
    private void deleteProfile(ProfileOriginator profile){
        
    }
    
}
