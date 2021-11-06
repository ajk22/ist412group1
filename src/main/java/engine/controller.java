/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import admin.adminController;
import admin.attractionDataUI;
import javax.swing.table.TableModel;
import login.loginUI;
import parkinfo.parkInfoController;
import planning.planningController;
import transactions.transactionsController;
import worker.workerController;

/**
 * mediates communication between other packages and engine + engine parts
 * This is a controller class for the engine package
 * 
 * !!THIS IS THE ONLY CLASS THAT IS TO COMMUNICATE WITH THE UIs DIRECTLY!!
 * !!THE CONTROLLER MEDIATES COMMUNICATION BETWEEN UIs and ENGINE + ENGINE PARTS!!
 * 
 * @author alexkinser
 */
public class controller {
    
    public engine engine;
    //mainUI is a main menu which is accessed only after the user starts the app and logs in
    public mainUI mainUI;
    //startUI is the opening screen, the first UI presented to the user
    public startUI startUI;
    public loginUI loginUI;
    public parkInfoController parkInfoController;
    public adminController adminController;
    public planningController planningController;
    public transactionsController transactionsController;
    public workerController workerController;
    private userList userList;
    private attractionList attractionList;
    private attractionDataUI attractionDataUI;
    
    /**
     * Constructor for the controller class.
     */
    public controller() {
        this.loginUI = new loginUI(this);
        this.mainUI = new mainUI(this);
        
        this.startUI = new startUI();
        this.workerController = new workerController();
        this.planningController = new planningController();
        this.parkInfoController = new parkInfoController();
        this.transactionsController = new transactionsController();
        
        this.engine = new engine(this);
        this.userList = engine.getUserList();
        this.attractionList = engine.getAttractionList();
        
        this.adminController = new adminController(this, this.attractionList);
        
        loginUI.populateUsernameList(getUserList());
        loginUI.setVisible(true);
    }

    /**
     * get the user list and pass off into other packages
     * @return the userList
     */
    public userList getUserList() {
        return userList;
    }

    /**
     * set the user list if it is updated
     * @param userList the userList to set
     */
    public void setUserList(userList userList) {
        this.userList = userList;
    }

    /**
     * get the attraction list and pass off into other packages
     * @return the attractionList
     */
    public attractionList getAttractionList() {
        return attractionList;
    }

    /**
     * set the attraction list if it is updated
     * @param attractionList the attractionList to set
     */
    public void setAttractionList(attractionList attractionList) {
        this.attractionList = attractionList;
    }

    /**
     * admin menu selected from the main menu.
     */
    public void adminSelectedFromMain() {
        adminController.setVisible();
    }  
    
    public void newPark(String[] tempArray, attractionList attractionlistTemp) {
        System.out.println(tempArray[0] + " " + attractionlistTemp.getAttractionList().get(0).toString());
        parkInfoController.newPark(tempArray, attractionlistTemp);
    }
    
}
