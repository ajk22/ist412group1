/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import engine.attractionList;
import java.util.Scanner;
import engine.ride;
/**
 * This will be used by ParkInfoUI to retrieve info to feed to the
 * user interface about the park and relevant information.
 */
public class parkInfo {
    
    public String parkName;
    public String openingTime;
    public String closingTime;
    public attractionList attractionList;
    //to be used by parkInfoUI
    //functionality to retrieve information to feed the UI
    //retrieve attraction name, attraction type, time it is open, location, etc...
    //...
    /**
     * This will be the constructor for the park info class.
     * @param parkName The name of the park
     * @param openingTime Time of opening for the park
     * @param closingTime Time of closing for the park
     * @param attractionList the list of the attractions at the park
     */
    public parkInfo(String parkName, String openingTime, String closingTime, attractionList attractionList) {
        this.attractionList = attractionList;
        this.closingTime = closingTime;
        this.openingTime = openingTime;
        this.parkName = parkName;
    }
    
    /**
     * Asks the user what ride they would like to retrieve information about
     */
    //retrieve information about the ride you want to display
    public void retrieveInfo(){
        //Could be deleted? What is this used for? - Alex
        System.out.println("Please enter the ride you would like to retrieve information about:");
        Scanner myRide = new Scanner(System.in);
        //rideName = myRide.nextLine();
    }
    
    /**
     * Organizes the ride object to display it in an organized way into the UI
     * @param rideToDisplay The ride that will be displayed to the UI
     */
    public void condenseInfo(ride rideToDisplay){
        //Could be deleted? What is this used for? - Alex
    }
    
    /**
     * Will return the information about the requested ride.
     * @param ride The ride that will be posted to the UI before its posted.
     * @return The name of the ride
     */
    public String displayInfo(String ride){
        //Could be deleted? What is this used for? - Alex
        return "";
    }
    

    
}

