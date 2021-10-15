/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

    /**
     * one of the extends attraction, ride.
     */
public class ride extends attraction {
    
    private String rideType;
    private double rideDuration;
    private int intensityRating;
    
    /**
     * Constructor for the ride class.
     * @param attractionName
     * @param openingTime
     * @param closingTime
     * @param rideType
     * @param rideDuration
     * @param intesityRating
     */
    public ride(String attractionName, String openingTime, String closingTime,
            String rideType, double rideDuration, int intensityRating) {
        
        super(attractionName, openingTime, closingTime);
        this.rideType = rideType;
        this.rideDuration = rideDuration;
        this.intensityRating = intensityRating;
    }

    /**
     * get the ride type
     * @return rideType
     */
    public String getRideType() {
        return rideType;
    }

    /**
     * set the ride type
     * @param rideType
     */
    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    /**
     * get the ride duration
     * @return rideDuration
     */
    public double getRideDuration() {
        return rideDuration;
    }

    /**
     * set the ride duration
     * @param rideDuration
     */
    public void setRideDuration(double rideDuration) {
        this.rideDuration = rideDuration;
    }

    /**
     * get the ride intensity rating
     * @return intensityRating
     */
    public int getIntensityRating() {
        return intensityRating;
    }

    /**
     * set the ride intensity rating
     * @param intensityRating
     */
    public void setIntensityRating(int intensityRating) {
        this.intensityRating = intensityRating;
    }
    
}
