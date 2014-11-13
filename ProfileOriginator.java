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
public class ProfileOriginator {
    
    private String username;
    private ArrayList<PlaylistObserver> playlists;  
    
    public ProfileOriginator(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void getPlaylists(){
        
        if(this.playlists==null){
            System.out.println("Profile: " + this.username + " has no Playlists added");
        }
        else{
            for(PlaylistObserver playlist:playlists)
            {
                System.out.println(playlist.getPlaylistTitle());  
            }
        }
    }
    
    
    
}
