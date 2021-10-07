/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import engine.attraction;
import engine.attractionList;
import engine.user;
import engine.userList;

/**
 * communicates with engine package
 * gives admin functionality to view and adjust a users information
 * 
 */
public class userStatus {    
    
    public userList userList;
    
    public userStatus(userList userList) {
        this.userList = userList;
    }
    
    //communicates with engine package
    //gives admin ability to view and edit user information
    //ex. locate user information for technical support
    //ex. manually delete users from database
    //ex. view collective statistics of user information 
    
    public void deleteUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void findUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void addUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void editUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return userList
     */
    public userList getUserList() {
        return userList;
    }

    /**
     * @param userList
     */
    public void setUserList(userList userList) {
        
    }
}
