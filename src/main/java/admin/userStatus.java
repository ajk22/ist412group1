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
 * communicates with engine package to
 * give admin functionality to view and adjust a users information
 */
public class userStatus {    
    
    public userList userList;
    
    /**
     * Constructor for the userStatus class that takes in a list of users
     * to track the status of. 
     * @param userList the list of users 
     */
    public userStatus(userList userList) {
        this.userList = userList;
    }
    
    //communicates with engine package
    //gives admin ability to view and edit user information
    //ex. locate user information for technical support
    //ex. manually delete users from database
    //ex. view collective statistics of user information 
    
    /**
     * Takes in a user to delete from the user list.
     * @param user the user to delete
     */
    public void deleteUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Takes in a user to check if that user is in the user list.
     * @param user the user to find
     */
    public void findUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Takes in a user to add to the user list
     * @param user the user to add
     */
    public void addUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Takes in a user to be able to access their information and make any
     * needed changes or edits.
     * @param user the user to edit
     */
    public void editUser(user user) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Displays the full user list.
     * @return userList the user to display
     */
    public userList getUserList() {
        return userList;
    }

    /**
     * Saves the user list with any changes or edits made.
     * @param userList the user list to set
     */
    public void setUserList(userList userList) {
        
    }
}
