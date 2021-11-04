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
    private final String objectIdentifier;
    
    /**
     * Constructor for the event class.
     * @param attractionName the name of the attraction
     * @param openingTime the opening time
     * @param closingTime the closing time
     * @param eventType the event type
     * @param eventCost the event cost
     * @param parkName the park that attraction is in
     */
    public event(String parkName, String attractionName, String openingTime, 
            String closingTime, String eventType, double eventCost) {
        
        super(parkName, attractionName, openingTime, closingTime);
        this.eventType = eventType;
        this.eventCost = eventCost;
        this.objectIdentifier = "Event";
    }

    /**
     * get the event type
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * set the event type
     * @param eventType the event type
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * get the event cost
     * @return eventCost
     */
    public double getEventCost() {
        return eventCost;
    }

    /**
     * set the event cost
     * @param eventCost the event cost
     */
    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }
    
    @Override
    /**
     * to string method for event
     * @return string for event
     */
    public String toString() {
        return "Event, " + super.toString() + ", " + this.getEventType() + ", " + this.getEventCost();
    }

    @Override
    /**
     * @return the objectIdentifier
     */
    public String getObjectIdentifier() {
        return objectIdentifier;
    }
}
