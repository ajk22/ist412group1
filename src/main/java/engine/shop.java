/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * extends attraction, shop.
 * 
 */
public class shop extends attraction {
    //extends attraction
    private String shopType;
    
    /**
     * Constructor for the restaurant class.
     * @param attractionName
     * @param openingTime
     * @param closingTime
     * @param shopType
     */
    public shop(String attractionName, String openingTime, String closingTime, String shopType) {
        super(attractionName, openingTime, closingTime);
        this.shopType = shopType;
    }

    /**
     * get the type of shop
     * @return shopType
     */
    public String getShopType() {
        return shopType;
    }

    /**
     * set the type of shop
     * @param shopType
     */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

  
}
