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
public class plansList extends plan {
    
    //a collection of a users plans to be used by the userPlanner class
    ArrayList<plansList> plans = new ArrayList<>();
    /**
     * Constructor for plansList class
     * @param attraction the attraction to plan
     * @param dayPlanned the day it's planned
     * @param timePlanned the time it's planned
     * @param cost the cost of the attraction 
     */
    public plansList(String attraction, String dayPlanned, String timePlanned, Double cost) {
        super(attraction, dayPlanned, timePlanned, cost);
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
