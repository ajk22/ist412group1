/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 * Will have the functionality to retrieve and verify user information
 * in order for them to be able to edit their info or plan a trip in the future.
 */
public class login {
    
    private String username;
    private String password;
    
    /**
     * Constructor for the login class.
     * @param username the users username
     * @param password the users password
     */
    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    /**
     * Takes in the username and password wanting to be verified
     * and returns the result.
     * @param username the users username
     * @param password the users password
     * @return Whether or not the verification was true or false
     */
    public boolean verifyInfo(String username, String password) {
        return false;
    }
    
    //login class... functionality needed
    //retrieve and verify username from usersList
    //retrieve and verify password from usersList
    //...

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
