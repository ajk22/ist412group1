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
    
    private ride displayedRide;
    private String rideName;
    //to be used by parkInfoUI
    //functionality to retrieve information to feed the UI
    //retrieve attraction name, attraction type, time it is open, location, etc...
    //...

    public parkInfo(String attractionName, String openingTime, String closingTime, String rideType, double rideDuration, int intensityRating) {
        super(attractionName, openingTime, closingTime, rideType, rideDuration, intensityRating);
        
    }
    
    //retrieve information about the ride you want to display
    public void retrieveInfo(){
        System.out.println("Please enter the ride you would like to retrieve information about:");
        Scanner myRide = new Scanner(System.in);
        rideName = myRide.nextLine();
    }
    
    //condenses the ride object to display it in an organized way into the UI
    public void condenseInfo(ride rideToDisplay){
    }
    
    //will display the retrieved information into the UI
    public void displayInfo(String ride){
    }
    

    
}

