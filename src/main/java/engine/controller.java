/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import admin.databaseUI;
import login.loginUI;
import parkinfo.parkInfoUI;
import parkinfo.parkMapUI;
import planning.userPlannerUI;
import transactions.transactionUI;
import worker.workerUI;

/**
 *  mediates communication between other packages and engine + engine parts
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
    public parkInfoUI parkInfoUI;
    public parkMapUI parkMapUI;
    public databaseUI databaseUI;
    public userPlannerUI userPlannerUI;
    public transactionUI transactionUI;
    public workerUI workerUI;
    
    public controller() {
        this.engine = new engine();
        this.mainUI = new mainUI();
        this.loginUI = new loginUI();
        this.workerUI = new workerUI();
        this.parkInfoUI = new parkInfoUI();
        this.parkMapUI = new parkMapUI();
        this.databaseUI = new databaseUI();
        this.userPlannerUI = new userPlannerUI();
        this.transactionUI = new transactionUI();
        this.startUI = new startUI();
    }
}
