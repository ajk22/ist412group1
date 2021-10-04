/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;


/**
 * this class is the class of user, including users' account user name and password.
 * @author alexkinser
 */
public class user {
   
    public String userName, password;

    public user(String userName, String password) {
        
        
        this.userName = userName;
        this.password = password;
    }

    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    


    
    
} 
   

