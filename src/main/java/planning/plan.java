/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planning;


/**
 * This abstract class will represent a "plan" that a user makes, possibly
 * including an attraction, the day planned, time planned, distance, cost
 * and more details involved.
 */
public class plan {
    
    String attraction;
    String dayPlanned;
    String timePlanned;
    Double cost;
    
    /**
     * Constructor for the plan class.
     * @param attraction the attraction to plan
     * @param dayPlanned the day it's planned
     * @param timePlanned the time it's planned
     * @param cost the cost of the attraction
     */
    public plan(String attraction, String dayPlanned, String timePlanned, Double cost){
        this.attraction = attraction;
        this.dayPlanned = dayPlanned;
        this.timePlanned = timePlanned;
        this.cost = cost;
    }
    //an object
    //a plan should have an attraction, day planned, time planned, estimated travel distance, etc...
    
    /**
     * Instantiates the day of the week the user wants to plan on.
     */
    public void setDayPlanned(){
    }
    
    /**
     * Instantiates the time of day the user wants to plan for.
     */
    public void setTimePlanned(){
    }
    
    /**
     * Instantiates the attraction that will be planned for. 
     */
    public void setAttraction(){
    }
    /**
     * Instantiates the cost for the attraction. 
     */
    public void setCost(){
    }
    
    /**
     * Calculates the cost for the planned day
     * @return cost
     */
    public Double getCost(){
        return cost;
    }
    /**
     * Returns the planned attraction
     * @return attraction
     */
    public String getAttraction() {
        return attraction;
    }
    
    /**
     * Returns the day planned for the plan
     * @return dayPlanned
     */
    public String getDate() {
        return dayPlanned;
    }
    
    
}
