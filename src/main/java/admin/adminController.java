/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import engine.attractionList;
import engine.controller;
import javax.swing.table.TableModel;

/**
 * this controller is the only thing in the package that is to communicate directly with engine package
 * this controller is used to communicate between model class(es) and the UI class(es).
 * 
 * @author alexkinser
 */
public class adminController {

    
    attractionStatus attractionStatus;
    userStatus userStatus;
    databaseUI databaseUI;
    controller controller;
    attractionDataUI attractionDataUI;
    attractionTableModel attractionTableModel;
    attractionList attractionList;
    rideTableModel rideTableModel;
    
    /**
    * This will be the constructor for the adminController class.
    * @param controller controller
    * @param attractionList attractionList
    */
    public adminController(controller controller, attractionList attractionList) {
        this.databaseUI = new databaseUI();   
        this.controller = controller;
        this.attractionList = attractionList;
        this.attractionDataUI = new attractionDataUI(this);

    }

    /**
    * Gets the attraction table model.
    */
    public attractionTableModel getAttractionTableModel() {
        attractionTableModel = new attractionTableModel(attractionList);
        return attractionTableModel;
    }

    /**
    * Sets the UI as visible.
    */
    public void setVisible() {
        attractionDataUI.setVisible(true);
    }

    /**
    * Gets the ride table model.
    */
    TableModel getRideTableModel() {
        rideTableModel = new rideTableModel(attractionList);
        return rideTableModel;
    }
   
    
}
