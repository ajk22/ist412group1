/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;


/**
 * this class is the class of user, including users' account user name and password.
 * 
 */
public class user {

    String first;
    String last;
   
    public String  userName, password;
    private String email;

    public user(String first, String last, String userName, String password, String email) {
        
        this.userName = userName;
        this.password = password;
        this.first = first;
        this.last = last;
        this.password = password;
        this.email = email;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    

    


    
    
} 
   

