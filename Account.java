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
public interface Account {
    
    void create(String accountName);
    void addProfile(String username);    
    void getProfiles();
    
}
