/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 * This will also extend the login class and will be a page where new users
 * can create an account which stores their information
 * 
 */
public class register {
    
    String username;
    String password;
    String question;
    String answer;
    
    /**
     * This will be the constructor which will take in the information the user
     * enters.
     * @param username the user name
     * @param password the password
     * @param question the question
     * @param answer the answer
     */
    public register(String username, String password, String question, String answer) {
        this.username = username;
        this.password = password;
        this.question = question;
        this.answer = answer;
    }
    
    /**
     * This will add the created account to the user registrar. 
     * @param username the user name
     * @param password the password
     * @param question the question
     * @param answer the answer
     * @return If it was successful.
     */
    public boolean addAccount(String username, String password, String question, String answer) {
        return false;
    }
    
    //register for account...
    //set username
    //set password
    //verify password
    //confirmation
    //...
}
