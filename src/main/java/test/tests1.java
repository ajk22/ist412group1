/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import engine.attraction;
import engine.attractionList;
import engine.event;
import engine.restaurant;
import engine.ride;
import engine.user;
import engine.userList;
import engine.vacationer;
import engine.worker;

/**
 *
 * @author alexkinser
 */
public final class tests1 {
    
    public tests1() {
        test1();
        test2();
        test3();
    }
    
    public void test1() {
        attraction ride1 = new ride("Ferris Wheel", "10:00 AM", "10:00 PM", 
            "Gentle", 110.5, 1);
        if (ride1.getAttractionName().equals("Ferris Wheel")) {
            System.out.println("Test 1 PASSED!");
        }
        else {
            System.out.println("Test 1 FAILED!");
        }
    }
    
    public void test2() {
        user vacationer1 = new vacationer("Julio", "Jones", "JulioJones123", "footballIsASport", "JulioJones@gmail.com");
        if (vacationer1.getEmail().equals("JulioJones@gmail.com")) {
            System.out.println("Test 2 PASSED!");
        }
        else {
            System.out.println("Test 2 FAILED!");
        }
    }
    
    public void test3() {
        user vacationer1 = new vacationer("Julio", "Jones", "JulioJones123", "footballIsASport", "JulioJones@gmail.com");
        user worker1 = new worker("Samuel", "Jackson", "MyNameIsSamuelJackson", "password123", 
            "SammyJack@gmail.com", "Ride Operator", 12.50);
        userList userList = new userList();
        userList.addUser(worker1);
        userList.addUser(vacationer1);
        
        if (userList.getUserList().size() == 2) {
            System.out.println("Test 3 PASSED!");
        }
        else {
            System.out.println("Test 3 FAILED!");
        }           
    }
    
    public void test4() {
        attraction ride1 = new ride("Ferris Wheel", "10:00 AM", "10:00 PM", 
            "Gentle", 110.5, 1);
        attraction restaurant1 = new restaurant("Ice Cream Stand", "12:00 PM", "10:00 PM", "Dessert");
        attraction event1 = new event("Halloween Parade", "12:00 PM", "1:00 PM", "Parade", 0);
        attractionList attractionList = new attractionList();
        attractionList.addAttraction(ride1);
        attractionList.addAttraction(restaurant1);
        attractionList.addAttraction(event1);
        boolean testBoolean = false;

        for (int i = 0; i < attractionList.getAttractionList().size(); i++) {
            if (attractionList.getAttractionList().get(i).getAttractionName().equals("FerrisWheel")) {
                testBoolean = true;
            }
        }
        
        if (testBoolean) {
            System.out.println("Test 4 PASSED!");
        } else {
            System.out.println("Test 4 FAILED!");
        }
        
    }
    
}
