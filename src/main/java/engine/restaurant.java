/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * this class is the class of restaurant, includes address, food and basic information of the restaurant in the park.
 * 
 */
public class restaurant extends attraction {
    private String foodType;
    private final String objectIdentifier;

    /**
     * Constructor for the restaurant class.
     * @param attractionName the attraction name
     * @param openingTime the opening time
     * @param closingTime the closing time
     * @param foodType the food type
     * @param parkName the park that attraction is in
     */
    public restaurant(String parkName, String attractionName, String openingTime, String closingTime, String foodType) {
        super(parkName, attractionName, openingTime, closingTime);
        this.foodType = foodType;
        this.objectIdentifier = "Restaurant";
    }

    /**
     * get the type of food offered at the restaurant
     * @return the foodType
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * set the type of food offered at the restaurant
     * @param foodType the foodType to set
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    
    @Override
    /**
     * to string method for restaurant
     * @return string for restaurant
     */
    public String toString() {
        return "Restaurant, " + super.toString() + ", " + this.getFoodType();
    }
    
    @Override
    /**
     * @return the objectIdentifer
     */
    public String getObjectIdentifier() {
        return objectIdentifier;
    }

    
}
