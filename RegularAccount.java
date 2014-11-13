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
public class RegularAccount implements Account{
    
    private ProfileOriginator profile;
    private Account regularAccount;
    private String accountName;
    private final String accountType = "Regular Account";
    
    @Override
    public void create(String accountName){
        Account regularAccount = new RegularAccount();
        this.regularAccount = regularAccount;
        this.accountName = accountName;
        System.out.println("Regular Account ("+accountName+") has been created");
    }
    
    @Override
    public void addProfile(String username){  
        if(this.profile==null){            
            ProfileOriginator regularProfile = new ProfileOriginator(username);
            this.profile = regularProfile;
            System.out.println("Account: " + accountName + " added new Profile: " + username); 
        }
        else{
            System.out.println("Please Upgrade to Premium to create more than one account.");
        }
    }
    
    @Override
    public void getProfiles(){
        if(this.profile==null){
            System.out.println("Account Name: " + accountName + " has no Profiles added");
        }
        else{
            System.out.println(profile);
        }        
    }
    
    public void upgradeToPremium(){
        this.regularAccount = new PremiumAccountDecorator(this.regularAccount);
    }
    
    public String getAccountName(){
        return this.accountName;
    }
    
}
