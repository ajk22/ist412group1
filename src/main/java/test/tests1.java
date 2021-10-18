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
import transactions.transaction;
import transactions.transactionList;
import planning.plan;
import planning.plansList;
import login.login;

/**
 *
 * @author alexkinser
 */
public final class tests1 {
    
    public tests1() {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
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
            if (attractionList.getAttractionList().get(i).getAttractionName().equals("Ferris Wheel")) {
                testBoolean = true;
            }
        }
        
        if (testBoolean) {
            System.out.println("Test 4 PASSED!");
        } else {
            System.out.println("Test 4 FAILED!");
        }
        
    }
    
    public void test5() {
        user vacationer1 = new vacationer("Julio", "Jones", "JulioJones123", "footballIsASport", "JulioJones@gmail.com");
        transaction trans1 = new transaction(vacationer1, "1/12/2021", "3:00 PM", "Tickets, VIP Passes", 200.00, 14.00, 2);
        
        if (trans1.getUser().getEmail().equals(vacationer1.getEmail())) {
            System.out.println("Test 5 PASSED!");
        } else {
            System.out.println("Test 5 FAILED!");
        }  
        
    }
    
    public void test6() {
        user vacationer1 = new vacationer("Julio", "Jones", "JulioJones123", "footballIsASport", "JulioJones@gmail.com");
        transaction trans1 = new transaction(vacationer1, "1/12/2021", "3:00 PM", "Tickets, VIP Passes", 200.00, 14.00, 2);
        transaction trans2 = new transaction(vacationer1, "1/13/2021", "12:30 PM", "Room Service, Taxi Ride, Show Tickets", 150.00, 10.50, 3);
        transactionList transList = new transactionList();
        transList.getTransactionList().add(trans1);
        transList.getTransactionList().add(trans2);
        transList.setTransactionList(transList.getTransactionList());
        
        if (transList.getTransactionList().size() == 2) {
            System.out.println("Test 6 PASSED!");
        } else {
            System.out.println("Test 6 FAILED!");
        }  
        
    }
    
    public void test7() {
        user vacationer1 = new vacationer("Julio", "Jones", "JulioJones123", "footballIsASport", "JulioJones@gmail.com");
        transaction trans1 = new transaction(vacationer1, "1/12/2021", "3:00 PM", "Tickets, VIP Passes", 200.00, 14.00, 2);
        transaction trans2 = new transaction(vacationer1, "1/13/2021", "12:30 PM", "Room Service, Taxi Ride, Show Tickets", 150.00, 10.50, 3);
        transactionList transList = new transactionList();
        transList.getTransactionList().add(trans1);
        transList.getTransactionList().add(trans2);
        transList.setTransactionList(transList.getTransactionList());
        
        double total = 0;
        for (int i = 0; i < transList.getTransactionList().size(); i++) {
            total = total + transList.getTransactionList().get(i).getAmount();
        }
        
        
        if (total == 350) {
          System.out.println("Test 7 PASSED!");
        } else {
            System.out.println("Test 7 FAILED!");
        }
    }
    
    public void test8() {
        plan plan1 = new plan("Roller Coaster 1", "01/30/22", "12:00 PM", 5.00);
        plan plan2 = new plan("Restaurant 4", "01/30/22", "1:00 PM", 25.00);
        plan plan3 = new plan("Afternoon Parade", "01/30/22", "3:00 PM", 0.00);
        
        plansList planList = new plansList();
        planList.getList().add(plan1);
        planList.getList().add(plan2);
        planList.getList().add(plan3);
        
        if (planList.getList().size() == 3) {
        System.out.println("Test 8 PASSED!");
        } else {
            System.out.println("Test 8 FAILED!");
        }
    }
    
    public void test9() {
        plan plan1 = new plan("Roller Coaster 1", "01/30/22", "12:00 PM", 5.00);
        plan plan2 = new plan("Restaurant 4", "01/30/22", "1:00 PM", 25.00);
        plan plan3 = new plan("Afternoon Parade", "01/30/22", "3:00 PM", 0.00);
        
        plansList planList = new plansList();
        planList.getList().add(plan1);
        planList.getList().add(plan2);
        planList.getList().add(plan3);
        
        boolean flag = true;
        for (int i = 0; i < planList.getList().size(); i++) {
            if (planList.getList().get(i).getDate().equals( "01/30/22")) {
                flag = true; 
            } else {
                flag = false;
                i = planList.getList().size();
            }
        }
        
        if (flag) {
            System.out.println("Test 9 PASSED!");
        } else {
            System.out.println("Test 9 FAILED!");
        }
    }
    
    public void test10() {
        login login1 = new login("user123", "password");
        login login2 = new login("user123", "abc123");
        
        if (login1.getUsername().equals(login2.getUsername())) {
            System.out.println("Test 10 PASSED!");
        } else {
            System.out.println("Test 10 FAILED!");
        }
        
    }
    
}
