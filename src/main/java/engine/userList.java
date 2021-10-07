/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.util.ArrayList;

    /** 
     * this class is the list of user, username&password, recording for the userlist
     */
public class userList{

    public ArrayList<user> userList;
    
    public userList() {
        this.userList = new ArrayList<>();
    }

    /**
     * @return the userList
     */
    public ArrayList<user> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<user> userList) {
        this.userList = userList;
    }
    
    public void addUser(user user) {
        userList.add(user);
        //sets list to a properly sorted list
        setUserList(this.sortList());
    }
    
    /**
     * @return this
     * sorts this list
     * returns this list
     */
    public ArrayList<user> sortList() {
        //TO DO
        return userList;
    }
    
}


