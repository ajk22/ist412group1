/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import admin.adminController;
import login.loginController;
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
    public loginController loginController;
    public parkInfoController parkInfoController;
    public adminController adminController;
    public planningController planningController;
    public transactionsController transactionsController;
    public workerController workerController;
    
    /**
     * Constructor for the controller class.
     */
    public controller() {
        this.engine = new engine();
        this.mainUI = new mainUI();
        this.startUI = new startUI();
        this.loginController = new loginController();
        this.workerController = new workerController();
        this.planningController = new planningController();
        this.adminController = new adminController();
        this.parkInfoController = new parkInfoController();
        this.transactionsController = new transactionsController();
    }
}
