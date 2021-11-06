/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.util.ArrayList;

    /** 
     * this class is a list of users, username and password, etc.
     */
public class userList{

    public ArrayList<user> userList;
    
    /**
     * Constructor for the userList class.
     */
    public userList() {
        this.userList = new ArrayList<>();
    }

    /**
     * gets the user list
     * @return the userList
     */
    public ArrayList<user> getUserList() {
        return userList;
    }
    
    /**
     * gets a specific user
     * @return the user
     */
    public user getUser(String username) {
        for(user user: userList) {
            if (user.userName == username) {
                return user;
            }
        }
        
        return null;
    }

    /**
     * sets the user list
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<user> userList) {
        this.userList = userList;
    }
    
    /**
     * adds a user to the list.
     * @param user the user
     */
    public void addUser(user user) {
        userList.add(user);
        //sets list to a properly sorted list
        setUserList(this.sortList());
    }
    
    /**
     * sorts the user list.
     * @return this
     */
    public ArrayList<user> sortList() {
        //TO DO
        return userList;
    }
    
}


