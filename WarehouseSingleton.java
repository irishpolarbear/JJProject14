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
public class WarehouseSingleton {
    
    private PlaylistObserver[] Playlists;
    private AccountDecorator[] Accounts;
    private SongfileState[] Songfiles;
    private static WarehouseSingleton instance = null;
    
    private WarehouseSingleton(){
        //Exists only to defeat instantiation  
        //By making this private only WarehouseSingleton() methods call it; however, 
        //that means ClassicSingleton cannot be subclassed
    }
    
    public static WarehouseSingleton initialize(){
        if(instance == null){
            instance = new WarehouseSingleton();            
        }
        return instance;
    }
    
    public void uploadAlbum(){
        
    }
    
    public void register(){
        
    }
    
    public void showAlbums(){
        
    }
    
    
    
            
    
}
