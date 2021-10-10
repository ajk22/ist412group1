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

    public plansList(String attraction, String dayPlanned, String timePlanned, Double cost) {
        super(attraction, dayPlanned, timePlanned, cost);
    }
    
    public void addToList(){
        //plans.add(plan);
    }
    
    public void displayList(){
    }
    
    //a collection of a users plans to be used by the userPlanner class
}
