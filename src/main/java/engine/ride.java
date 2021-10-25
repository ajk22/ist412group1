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
    private final String objectIdentifier;
    
    /**
     * Constructor for the ride class.
     * @param attractionName the attraction name
     * @param openingTime the opening time
     * @param closingTime the closing time
     * @param rideType the ride type
     * @param rideDuration the ride duration
     * @param intensityRating the ride intensity rating
     */
    public ride(String attractionName, String openingTime, String closingTime,
            String rideType, double rideDuration, int intensityRating) {
        
        super(attractionName, openingTime, closingTime);
        this.rideType = rideType;
        this.rideDuration = rideDuration;
        this.intensityRating = intensityRating;
        this.objectIdentifier = "Ride";
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
     * @param rideType the ride type
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
     * @param rideDuration the ride duration
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
     * @param intensityRating the ride intensity rating
     */
    public void setIntensityRating(int intensityRating) {
        this.intensityRating = intensityRating;
    }
    
    @Override
    /**
     * to string method for ride
     * @return string for ride
     */
    public String toString() {
        return "Ride, " + super.toString() + ", " + 
                this.getRideType() + ", " + this.getRideDuration() + ", " + this.getIntensityRating();
    }
    
    public String TrueToString() {
        return super.toString() + ", " + this.getRideType() + ", " + this.getRideDuration() + ", " + this.getIntensityRating();
    }

    @Override
    /**
     * @return the objectIdentifer
     */
    public String getObjectIdentifier() {
        return objectIdentifier;
    }
    
}
