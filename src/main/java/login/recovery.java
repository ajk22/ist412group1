/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 * This will extend the login class and will allow users to enter a page where
 * they can recover their password or set a new one.
 * 
 */
public class recovery {
    
    public boolean resetPassword(String username) {
        return false;
    }
    
    public String getSecurityQuestion(String username) {
        return "";
    }
    
    public boolean verifySecurityQuestion(String username, String answer) {
        return false;
    }
    
    public boolean setNewPassword(String username, String password) {
        return false;
    }
    
    //recover account... functionality neeeded
    //find password based on username
    //ask security question to retrieve password
    //...
}
