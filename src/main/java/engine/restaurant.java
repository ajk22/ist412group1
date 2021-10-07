/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * this class is the class of restaurant, includes address, food and basic information of the restaurant in the park
 * 
 */
public class restaurant extends attraction {
    private String foodType;
    /**
     * foodType = type of food in the restaurant (example: tacos, sandwiches, ice cream, etc.)
     * @param foodType
     */

    /**
     * constructor
     */
    public restaurant(String attractionName, String openingTime, String closingTime, String foodType) {
        super(attractionName, openingTime, closingTime);
        this.foodType = foodType;
    }

    /**
     * @return the foodType
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * @param foodType the foodType to set
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    
}
