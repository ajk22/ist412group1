/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * one of the extends attraction, shop
 * 
 */
public class shop extends attraction {
   
    //extends attraction
    private String shopType;
    
    public shop(String attractionName, String openingTime, String closingTime, String shopType) {
        super(attractionName, openingTime, closingTime);
        this.shopType = shopType;
    }

    /**
     * @return shopType
     */
    public String getShopType() {
        return shopType;
    }

    /**
     * @param shopType
     */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

  
}
