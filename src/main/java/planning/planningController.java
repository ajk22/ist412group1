/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planning;

import engine.controller;

/**
 *
 * this controller is the only thing in the package that is to communicate directly with engine package
 * this controller is used to communicate between model class(es) and the UI class(es).
 * 
 * @author alexkinser
 */
public class planningController {
    
    userPlannerUI userPlannerUI;
    private userPlanner userPlanner;
    private plansList plansList;
    
    /**
     * Constructor for the planninController class.
     */
    public planningController() {
        
        this.userPlannerUI = new userPlannerUI();
        this.userPlanner = new userPlanner();
        this.plansList = new plansList();
    }

    /**
     * @return the userPlanner
     */
    public userPlanner getUserPlanner() {
        return userPlanner;
    }

    /**
     * @param userPlanner the userPlanner to set
     */
    public void setUserPlanner(userPlanner userPlanner) {
        this.userPlanner = userPlanner;
    }

    /**
     * @return the plansList
     */
    public plansList getPlansList() {
        return plansList;
    }

    /**
     * @param plansList the plansList to set
     */
    public void setPlansList(plansList plansList) {
        this.plansList = plansList;
    }
    
}
