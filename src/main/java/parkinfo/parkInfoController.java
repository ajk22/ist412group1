/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import engine.attractionList;
import engine.controller;
import javax.swing.table.TableModel;

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
    parksList parksList;
    parkAttractionsTableModel parkAttractionsTableModel;
    controller controller;
    parkRestaurantTableModel parkRestaurantTableModel;
    parkRideTableModel parkRideTableModel;
    parkShopTableModel parkShopTableModel;
    parkEventTableModel parkEventTableModel;
    parkSelectUI parkSelectUI;
    
    /**
     * Constructor for the parkInfoController class.
     * @param controller the engine controller
     */
    public parkInfoController(controller controller) {
        this.controller = controller;
        //null pointer caused by class being called too early
        this.parksList = new parksList(this);
        this.controller.setParkInfoController(this);
        parksList.loadParks();
        this.parkSelectUI = new parkSelectUI(this);
        this.parkAttractionsTableModel = new parkAttractionsTableModel(this, "Park 1", this.parksList);
        this.parkInfoUI = new parkInfoUI(this, parkAttractionsTableModel, "Park 1");
        this.parkMapUI = new parkMapUI();
    }

    /**
     * @param tempArray the general park info passed from the engine
     * @param attractionList the list of attractions in the park
     */
    public void newPark(String[] tempArray, attractionList attractionList) {
        parksList.addPark(tempArray, attractionList);
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
    
    public void loadParks() {
        controller.loadParks();
    }  
    
    public void parkInfoVisible(String identifier) {
        this.parkAttractionsTableModel = new parkAttractionsTableModel(this, identifier, this.parksList);
        this.parkInfoUI = new parkInfoUI(this, parkAttractionsTableModel, identifier);
        parkInfoUI.setVisible(true);
    }

    public void setVisible() {
        controller.mainUI.setVisible(false);
        parkSelectUI.setVisible(true);
    }
    
    public parkRideTableModel setAsRidesTableModel(String identifier) {
        this.parkRideTableModel = new parkRideTableModel(this, identifier, this.parksList);
        return parkRideTableModel;
    }
    
    public parkEventTableModel setAsEventsTableModel(String identifier) {
        this.parkEventTableModel = new parkEventTableModel(this, identifier, this.parksList);
        return parkEventTableModel;
    }
    
    public parkShopTableModel setAsShopTableModel(String identifier) {
        this.parkShopTableModel = new parkShopTableModel(this, identifier, this.parksList);
        return parkShopTableModel;
    }
    
    public parkRestaurantTableModel setAsRestaurantTableModel(String identifier) {
        this.parkRestaurantTableModel = new parkRestaurantTableModel(this, identifier, this.parksList);
        return parkRestaurantTableModel;
    }

    public void returnToMainUI() {
        controller.mainUI.setVisible(true);
        
    }
    
}
    

