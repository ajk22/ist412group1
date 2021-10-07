/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

   /** extends attraction
     * this is a class for events of the park. The name of the event and time will be listed.
     * ex. a parade
     * ex. another special event at the park
     * ex. character photo opportunities
     * ex. musical street performance
     * ex. anything that is not a ride, restaurant, or shop
     */
public class event extends attraction {
    
    private String eventType;
    private double eventCost;
    
    public event(String attractionName, String openingTime, 
            String closingTime, String eventType, double eventCost) {
        
        super(attractionName, openingTime, closingTime);
        this.eventType = eventType;
        this.eventCost = eventCost;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return eventCost
     */
    public double getEventCost() {
        return eventCost;
    }

    /**
     * @param eventCost
     */
    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }
}
