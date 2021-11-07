/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


    /**this class is for:
     * bulk of project relies on engine and its functions
     * reading and writing data
     * saving and updating information
     * initialize the process of creating all objects and lists.
     */
public class engine {
    
    public attractionList attractionList;
    private userList userList;
    public controller controller;
    
    /**
     * Constructor for the attractionList class.
     * @param controller
     */
    public engine(controller controller) {
        
        this.userList = new userList();
        this.attractionList = new attractionList();
        this.controller = controller;
        startEngine();
    }

    /**
     * starts the engine... loads data
     */
    public void startEngine() {        
        //TO-DO
        //1. Implement methods to load and parse data files to create objects
        //2. Implement methods to save data
        //3. Implement methods to communicate with other parts in the engine
        //4. Implement methods to communicate with the controller
        
        File usersFile = new File("src/main/java/data/users.txt");
        System.out.println("file loaded...");
        ArrayList<String> usersDataStrings = fileIterator(usersFile);
        translateUsers(usersDataStrings);
        
        File attractionsFile = new File("src/main/java/data/parkInfo.txt");
        System.out.println("file loaded...");
        ArrayList<String> attractionDataStrings = fileIterator(attractionsFile);
        translateAttractions(attractionDataStrings);             
    }
    
    public void loadParks() {
        File parksFile = new File("src/main/java/data/parks.txt");
        System.out.println("file loaded...");
        ArrayList<String> parksStrings = fileIterator(parksFile);
        translateParks(parksStrings);
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * iterates through the file and creates array list of strings
     * @param file the specific data file to be read
     * @return an array list of strings read from the file
     */
    public ArrayList<String> fileIterator(File file) {
        FileInputStream fileInput = null;
        ArrayList<String> returnList = new ArrayList<>();
        
        try {
            fileInput = new FileInputStream(file);
            try (Scanner scnr = new Scanner(fileInput)) {
                
                String temp;
                
                while(scnr.hasNext()) {
                    temp = scnr.nextLine();
                    returnList.add(temp);
                }
            } 
        } catch (FileNotFoundException ex) {
            
            System.out.println(ex);
        } 
        
        return returnList;
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the user to create an object
     * identifies the correct type of user
     * @param list the list of strings of user information
     */
    public void translateUsers(ArrayList<String> list) {       
        userList.getUserList().clear();
        
        String temp;
        user temp2;
        
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if (temp.contains("Vacationer, ")) {
                String concat = temp.substring(12);
                temp2 = translateVactioner(concat);
                userList.addUser(temp2);
                System.out.println("User Added! \n"
                        + temp2.toString() + "\n");
            } else if (temp.contains("Worker, ")) {
                String concat = temp.substring(8);
                temp2 = translateWorker(concat);
                userList.addUser(temp2);
                System.out.println("User Added! \n"
                        + temp2.toString() + "\n");
            } else if (temp.contains("Admin, ")) {
                String concat = temp.substring(7);
                temp2 = translateAdmin(concat);
                userList.addUser(temp2);
                System.out.println("User Added! \n"
                        + temp2.toString() + "\n");
            }         
        }       
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the attraction to create an object
     * identifies the correct type of attraction
     * @param list the list of strings of attraction information
     */
    public void translateAttractions(ArrayList<String> list) {       
        attractionList.getAttractionList().clear();
        
        String temp;
        attraction temp2;
        
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if (temp.contains("Shop, ")) {
                String concat = temp.substring(6);
                temp2 = translateShop(concat);
                attractionList.addAttraction(temp2);
                System.out.println("Attraction Added! \n"
                        + temp2.toString() + "\n");
            } else if (temp.contains("Ride, ")) {
                String concat = temp.substring(6);
                temp2 = translateRide(concat);
                attractionList.addAttraction(temp2);
                System.out.println("Attraction Added! \n"
                        + temp2.toString() + "\n");
            } else if (temp.contains("Restaurant, ")) {
                String concat = temp.substring(12);
                temp2 = translateRestaurant(concat);
                attractionList.addAttraction(temp2);
                System.out.println("Attraction Added! \n"
                        + temp2.toString() + "\n");
            } else if (temp.contains("Event, ")) {
                String concat = temp.substring(7);
                temp2 = translateEvent(concat);
                attractionList.addAttraction(temp2);
                System.out.println("Attraction Added! \n"
                        + temp2.toString() + "\n");
            }            
        }       
    }
    
    public void translateParks(ArrayList<String> parksStrings) {
        int temp = parksStrings.size();
        
        for (int i = 0; i < temp; i++) {
            String tempString = parksStrings.get(i);
            String[] tempArray = tempString.split(", ");
            
            System.out.println("Adding new park");
            newPark(tempArray);
        }
        
    }
    
    public void newPark(String[] tempArray) {
        System.out.println(tempArray[0]);
        controller.newPark(tempArray, getParkAttractions(tempArray[0]));
    }
    
    public attractionList getParkAttractions(String parkName) {
        
        attractionList parkAttractionsTemp = new attractionList();
        parkAttractionsTemp.getAttractionList().clear();
        
        for (int i = 0; i < attractionList.getAttractionList().size(); i++) {
            if (attractionList.getAttractionList().get(i).getParkName().equals(parkName)) {
                parkAttractionsTemp.addAttraction(attractionList.getAttractionList().get(i));
                System.out.println(attractionList.getAttractionList().get(i).toString());
            }
        }
        
        return parkAttractionsTemp;
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the user to create an object
     * @param temp the user information
     */
    private vacationer translateVactioner(String temp) {
        String[] tempArray = temp.split(", ");
        
   
        return new vacationer(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4]);        
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the user to create an object
     * @param temp the user information
     */
    private worker translateWorker(String temp) {
        String[] tempArray = temp.split(", ");
        
        double salary = Double.parseDouble(tempArray[6]);
        
        return new worker(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], salary);
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the user to create an object
     * @param temp the user information
     */
    private admin translateAdmin(String temp) {
        String[] tempArray = temp.split(", ");
        
        int key = Integer.parseInt(tempArray[5]);
        
        return new admin(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], key);
    }
    
    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the attraction to create an object
     * @param temp the attraction information
     */
    private attraction translateShop(String temp) {
        String[] tempArray = temp.split(", ");
        
        return new shop(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4]);
    }

    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the attraction to create an object
     * @param temp the attraction information
     */
    private attraction translateRide(String temp) {
        String[] tempArray = temp.split(", ");
        
        double duration = Double.parseDouble(tempArray[5]);
        int intensity = Integer.parseInt(tempArray[6]);
        
        return new ride(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], duration, intensity);
    }

    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the attraction to create an object
     * @param temp the attraction information
     */
    private attraction translateRestaurant(String temp) {
        String[] tempArray = temp.split(", ");
        
        return new restaurant(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4]);
    }

    /**
     * PART OF ITERATOR PATTERN - Alex Kinser
     * translate the attraction to create an object
     * @param temp the attraction information
     */
    private attraction translateEvent(String temp) {
        String[] tempArray = temp.split(", ");
        
        double cost = Double.parseDouble(tempArray[5]);
        
        return new event(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], cost);
    }
    

    /**
     * gets the attraction list
     * @return attractionList
     */
    public attractionList getAttractionList() {
        return attractionList;
    }

    /**
     * set the attraction list
     * @param attractionList the attraction list
     */
    public void setAttractionList(attractionList attractionList) {
        this.attractionList = attractionList;
    }

    /**
     * get the user list
     * @return userList
     */
    public userList getUserList() {
        return userList;
    }

    /**
     * set the user list
     * @param userList the user list
     */
    public void setUserList(userList userList) {
        this.userList = userList;
    }
    
}
