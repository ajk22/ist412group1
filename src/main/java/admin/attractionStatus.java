/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import engine.attraction;
import engine.attractionList;
import engine.engine;

/**
 * This class will be pulling from the attraction package
 * which will house all of ride info. This will act as a
 * control of sorts. In this controller we will have the functionality
 * to close a ride, add a ride, edit restaurant information and view
 * ride statistics
 * 
 * 
 */
public class attractionStatus {
    

    public attractionList attractionList;
    
    /**
    * This will be the constructor for the attractionStatus class
    * 
    * @param attractionList information taken from the ride class so that it can be added to
    * a list
    */
    public attractionStatus(attractionList attractionList) {
        this.attractionList = attractionList;
    }
    
    //communicates with engine package
    //gives admin ability to view and edit attraction information
    //ex. close a ride
    //ex. add a new ride
    //ex. edit restaurant information
    //ex. view ride statistics
    
    /**
     * Deletes an attraction from the attraction list
     * @param attraction the attraction
     */
    public void deleteAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Searches the attraction list for a particular attraction
     * @param attraction the attraction
     */
    public void findAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Adds an attraction to the attraction list
     * @param attraction the attraction
     */
    public void addAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Allows the user or admin to rewrite an attraction description
     * @param attraction the attraction
     */
    public void editAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Pulls the attraction list and displays it to the user
     * @return attractionList the attraction list
     */
    public attractionList getAttractionList() {
        return attractionList;
    }

    /**
     * Saves the attraction list with any changes or edits made
     * @param attractionList the attraction list
     */
    public void setAttractionList(attractionList attractionList) {
        
    }
    
}
