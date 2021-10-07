/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * this is a base class for ride, shop, restaurant, and event
 * @author alexkinser
 */
public class attraction {
    
    private String attractionName;
    private String openingTime;
    private String closingTime;
    
    public attraction(String attractionName, String openingTime, String closingTime) {
        this.attractionName = attractionName;
        this.closingTime = closingTime;
        this.openingTime = openingTime;
    }

    /**
     * @return attractionName
     */
    public String getAttractionName() {
        return attractionName;
    }

    /**
     * @param attractionName
     */
    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    /**
     * @return openingTime
     */
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * @param openingTime
     */
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * @return closingTime
     */
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * @param closingTime
     */
    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }
    
}
