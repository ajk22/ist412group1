/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

import engine.controller;

/**
 *
 * this controller is the only thing in the package that is to communicate directly with engine package
 * this controller is used to communicate between model class(es) and the UI class(es).
 * 
 * @author alexkinser
 */
public class workerController {
    
    workerUI workerUI;
    
    /**
     * Constructor for the workerController class.
     */
    public workerController() {
        this.workerUI = new workerUI();
    }
    
}
