/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planning;

import java.util.*;

/**
 * This class will help users list out all of the plans they
 * currently have created or planned.
 */
public class plansList {
    
    //a collection of a users plans to be used by the userPlanner class
    ArrayList<plan> plans = new ArrayList<>();
    /**
     * Constructor for plansList class.
     */
    public plansList() {
        //super(attraction, dayPlanned, timePlanned, cost);
        this.plans = new ArrayList<>();
    }
    
    /**
     * the list of plans
     * @return plans the list of plans
     */
    public ArrayList<plan> getList() {
        return this.plans;
    }
    
    /**
     * the list of plans
     * @param plans the list of plans
     */
    public void setList(ArrayList<plan> plans) {
        this.plans = plans;
    }
    
    /**
     * Adds a plan object to a list of plans
     */
    public void addToList(){
        //plans.add(plan);
    }
    /**
     * Displays the list of plans
     */
    public void displayList(){
    }
    
    //a collection of a users plans to be used by the userPlanner class
}
