/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import engine.attractionList;

/**
 *
 * this controller is the only thing in the package that is to communicate directly with engine package
 * this controller is used to communicate between model class(es) and the UI class(es).
 * 
 * @author alexkinser
 */
public class parkInfoController {
    
    parkInfoUI parkInfoUI;
    parkMapUI parkMapUI;
    private parksList parksList;
    
    /**
     * Constructor for the parkInfoController class.
     */
    public parkInfoController() {
        this.parkInfoUI = new parkInfoUI();
        this.parkMapUI = new parkMapUI();
        this.parksList = new parksList();
    }

    /**
     * @param tempArray the general park info passed from the engine
     * @param attractionList the list of attractions in the park
     */
    public void newPark(String[] tempArray, attractionList attractionList) {
        getParksList().addPark(tempArray, attractionList);
    }

    /**
     * @return the parksList
     */
    public parksList getParksList() {
        return parksList;
    }

    /**
     * @param parksList the parksList to set
     */
    public void setParksList(parksList parksList) {
        this.parksList = parksList;
    }
    
    
}
