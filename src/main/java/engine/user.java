/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;


/**
 * this class is the class of user, including user account user name and password.
 * 
 */
public class user {

    String first;
    String last;
   
    public String  userName, password;
    private String email;

    /**
     * Constructor for the user class.
     * @param first first name
     * @param last last name
     * @param userName user name
     * @param password password
     * @param email email
     */
    public user(String first, String last, String userName, String password, String email) {
        
        this.userName = userName;
        this.password = password;
        this.first = first;
        this.last = last;
        this.password = password;
        this.email = email;
    }

    /**
     * gets the username
     * @return userName
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * sets the username
     * @param userName the username
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * gets the password
     * @return password the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets the password
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * gets the first name
     * @return first 
     */
    public String getFirst() {
        return first;
    }

    /**
     * sets the first name
     * @param first the first name
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * gets the last name
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * sets the last name
     * @param last the last name
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * gets the email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets the email
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    /**
     * to string method for user
     * @return string for user
     */
    public String toString() {
        
        return this.getFirst() + ", " + this.getLast() + ", " + this.getUserName() + ", " + 
                this.getPassword() + ", " + this.getEmail();
    }

    
} 
   

