/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 *
 * @author alexkinser
 */
public class event {
    /**extends attraction
     * ex. a parade
     * ex. another special event at the park
     * ex. character photo opportunities
     * ex. musical street performance
     * ex. anything that is not a ride, restaurant, or shop
     */
    
    public String name, time;
    /**
     * name = event name
     * time = time of the event
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * Getter and Setter of name and time 
     */

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public event(String name, String time) {
        this.name = name;
        this.time = time;
    }
    /**
     * default constructor
     */
}
