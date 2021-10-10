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
    
    public plan(String attraction, String dayPlanned, String timePlanned, Double cost){
        this.attraction = attraction;
        this.dayPlanned = dayPlanned;
        this.timePlanned = timePlanned;
        this.cost = cost;
    }
    //an object
    //a plan should have an attraction, day planned, time planned, estimated travel distance, etc...
    
    public void setDayPlanned(){
    }
    
    public void setTimePlanned(){
    }
    
    public void setAttraction(){
    }
    
    public void setCost(){
    }
    
    public Double getCost(){
        return cost;
    }
    public String getAttraction() {
        return attraction;
    }
    
    
}
