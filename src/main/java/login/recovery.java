/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 * This will extend the login class and will allow users to enter a page where
 * they can recover their password or set a new one.
 */
public class recovery {
    
    public String username;
    public String answer;
    public String password;
    public boolean verify;
    
    /**
     * The constructor of the recovery class.
     * @param username the users username
     * @param answer the users security answer
     * @param password the users password
     * @param verify the Boolean that changes based on if the user is verified
     */
    public recovery(String username, String answer, String password, boolean verify){
        this.verify = verify;
        this.username = username;
        this.answer = answer;
        this.password = password;
    }
    /**
     * Takes in a username to be able to verify what user wants to reset their
     * password.
     * @param username the users username
     * @return To see if the username entered is verified.
     */
    public boolean resetPassword(String username) {
        return verify;
    }
    /**
     * Takes in the username to display the security question that is tied to
     * the account.
     * @param username the users username
     * @return The security question tied to the account
     */
    public String getSecurityQuestion(String username) {
        return "";
    }
    /**
     * Takes in the security question and compares that to the username
     * and answer of the question to verify its correctness. 
     * @param username the users username
     * @param answer the users password
     * @return If the answer is verified
     */
    public boolean verifySecurityQuestion(String username, String answer) {
        return verify;
    }
    
    /**
     * Takes in the users username and password to verify the user then
     * asks the user to input the designated password.
     * @param username the users username
     * @param password the users password
     * @return If the operation was successful
     */
    public boolean setNewPassword(String username, String password) {
        return verify;
    }
    
    //recover account... functionality neeeded
    //find password based on username
    //ask security question to retrieve password
    //...
}
