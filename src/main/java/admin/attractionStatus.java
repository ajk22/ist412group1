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
    
    public attractionStatus(attractionList attractionList) {
        this.attractionList = attractionList;
    }
    
    //communicates with engine package
    //gives admin ability to view and edit attraction information
    //ex. close a ride
    //ex. add a new ride
    //ex. edit restaurant information
    //ex. view ride statistics
    
    public void deleteAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void findAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void addAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void editAttraction(attraction attraction) {
        //TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return attractionList
     */
    public attractionList getAttractionList() {
        return attractionList;
    }

    /**
     * @param attractionList
     */
    public void setAttractionList(attractionList attractionList) {
        
    }
    
}
