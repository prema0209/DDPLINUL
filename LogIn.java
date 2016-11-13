/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inulcell;

/**
 *
 * @author prema
 */


public class LogIn {
  
    LogInDB data;
    boolean hasil;
    MenuAwal menu;
    
    public LogIn(){
        data=new LogInDB();
        menu=new MenuAwal();
    }
    
    public boolean login(String user, String password){
        
       hasil=data.CekUserPass(user, password);
       
       return false;
    }
    
    
    
    
}
