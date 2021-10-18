/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

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
    
    /**
     * Constructor for the parkInfoController class.
     */
    public parkInfoController() {
        this.parkInfoUI = new parkInfoUI();
        this.parkMapUI = new parkMapUI();
    }
    
}
