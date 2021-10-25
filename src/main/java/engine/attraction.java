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
    
    /**
     * Constructor for the attraction class.
     * @param attractionName the name of the attraction
     * @param openingTime the opening time of the attraction
     * @param closingTime the closing time of the attraction
     */
    public attraction(String attractionName, String openingTime, String closingTime) {
        this.attractionName = attractionName;
        this.closingTime = closingTime;
        this.openingTime = openingTime;
    }

    /**
     * get the attraction name
     * @return attractionName
     */
    public String getAttractionName() {
        return attractionName;
    }

    /**
     * set the attraction name
     * @param attractionName the attraction name
     */
    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    /**
     * get the attraction opening time
     * @return openingTime
     */
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * set the attraction opening time
     * @param openingTime the opening time
     */
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    /**
     * get the attraction closing time
     * @return closingTime
     */
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * set the attraction closing time
     * @param closingTime the closing time
     */
    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }
    
    @Override
    /**
     * to string method for attraction
     * @return string for attraction
     */
    public String toString() {
        return this.getAttractionName() + ", " + this.getOpeningTime() + ", " + this.getClosingTime();
    }
    
    public String getObjectIdentifier() {
        
        return "";
    }
    
}
