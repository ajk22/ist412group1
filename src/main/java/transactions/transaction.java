/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactions;
import engine.user;

/**
 *
 * @author alexkinser
 */
public class transaction {
    
    /**
    * an object to record a users supposed transactions 
    * user, date, time, amount in $, item purchased(attraction), etc.
    */
    
    private user user;
    private String date;
    private String time;
    private String items;
    private int numOfItems;
    private double amount;
    private double tax;
    
    /**
     * Constructor for the transaction class.
     * @param user
     * @param date
     * @param time
     * @param items
     * @param amount
     * @param tax
     * @param numOfItems
     */
    public transaction(user user, String date, String time, String items, double amount, double tax, int numOfItems) {
        this.user = user;
        this.date = date;
        this.time = time;
        this.items = items;
        this.amount = amount;
        this.tax = tax;
        this.numOfItems = numOfItems;
    }

    /**
     * @return user
     */
    public user getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(user user) {
        this.user = user;
    }

    /**
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return items
     */
    public String getItems() {
        return items;
    }

    /**
     * @param items
     */
    public void setItems(String items) {
        this.items = items;
    }

    /**
     * @return numOfItems
     */
    public int getNumOfItems() {
        return numOfItems;
    }

    /**
     * @param numOfItems
     */
    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    /**
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax
     */
    public void setTax(double tax) {
        this.tax = tax;
    }
    
    
    
    
}
