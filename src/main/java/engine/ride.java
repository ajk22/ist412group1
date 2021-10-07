/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
     * one of the extends attraction, ride
     */
public class ride extends attraction {
    
    private String rideType;
    private double rideDuration;
    private int intensityRating;
    
    public ride(String attractionName, String openingTime, String closingTime,
            String rideType, double rideDuration, int intensityRating) {
        
        super(attractionName, openingTime, closingTime);
        this.rideType = rideType;
        this.rideDuration = rideDuration;
        this.intensityRating = intensityRating;
    }

    /**
     * @return rideType
     */
    public String getRideType() {
        return rideType;
    }

    /**
     * @param rideType
     */
    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    /**
     * @return rideDuration
     */
    public double getRideDuration() {
        return rideDuration;
    }

    /**
     * @param rideDuration
     */
    public void setRideDuration(double rideDuration) {
        this.rideDuration = rideDuration;
    }

    /**
     * @return intensityRating
     */
    public int getIntensityRating() {
        return intensityRating;
    }

    /**
     * @param intensityRating
     */
    public void setIntensityRating(int intensityRating) {
        this.intensityRating = intensityRating;
    }
    
}
