/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * extends user and this is the creation of the admin object.
 * 
 */
public class admin extends user {
    
    private int databasePersonalKey;
    
    /**
     * Constructor for the admin class.
     * @param first the first name
     * @param last the last name
     * @param userName the username
     * @param password the password
     * @param email the email
     * @param key key for admin access, security precaution
     */
    public admin(String first, String last, String userName, String password, String email, int key) {
        super(first, last, userName, password, email);
        this.databasePersonalKey = key;
    }

    /**
     * get the admins database key
     * @return databasePersonalKey
     */
    public int getDatabasePersonalKey() {
        return databasePersonalKey;
    }

    /**
     * set the admins database key
     * @param databasePersonalKey the database key
     */
    public void setDatabasePersonalKey(int databasePersonalKey) {
        this.databasePersonalKey = databasePersonalKey;
    }
    
    @Override
    /**
     * to string method for admin
     * @return string for admin
     */
    public String toString() {
        
        String temp = super.toString();
        String type = "Admin, ";
        
        return type.concat(temp) + ", " + this.getDatabasePersonalKey();
    }
    
    
}
