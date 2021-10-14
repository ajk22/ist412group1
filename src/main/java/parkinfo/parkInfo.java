/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import java.util.Scanner;
import engine.ride;
/**
 * This will be used by ParkInfoUI to retrieve info to feed to the
 * user interface about the park and relevant information.
 */
public class parkInfo extends ride{
    
    public ride displayedRide;
    public String rideName;
    //to be used by parkInfoUI
    //functionality to retrieve information to feed the UI
    //retrieve attraction name, attraction type, time it is open, location, etc...
    //...
    /**
     * This will be the constructor for the park info class.
     * @param attractionName The name of the attraction
     * @param openingTime Time of opening for the attraction
     * @param closingTime Time of closing for the attraction
     * @param rideType The type of ride the attraction is
     * @param rideDuration The duration while on the ride
     * @param intensityRating The amount of intensity rated 1-10
     * @param displayedRide The ride that will be posted to the UI
     * @param rideName 
     */
    public parkInfo(String attractionName, String openingTime, String closingTime, String rideType, double rideDuration, int intensityRating,
            ride displayedRide, String rideName) {
        super(attractionName, openingTime, closingTime, rideType, rideDuration, intensityRating);
        this.displayedRide = displayedRide;
        this.rideName = rideName;
    }
    
    /**
     * Asks the user what ride they would like to retrieve information about
     */
    //retrieve information about the ride you want to display
    public void retrieveInfo(){
        System.out.println("Please enter the ride you would like to retrieve information about:");
        Scanner myRide = new Scanner(System.in);
        rideName = myRide.nextLine();
    }
    
    /**
     * Organizes the ride object to display it in an organized way into the UI
     * @param rideToDisplay The ride that will be displayed to the UI
     */
    public void condenseInfo(ride rideToDisplay){
    }
    
    /**
     * Will return the information about the requested ride.
     * @param ride The ride that will be posted to the UI before its posted.
     * @return The name of the ride
     */
    public String displayInfo(String ride){
        return "";
    }
    

    
}

