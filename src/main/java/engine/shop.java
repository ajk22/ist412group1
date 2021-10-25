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
    private final String objectIdentifier;
    
    /**
     * Constructor for the restaurant class.
     * @param attractionName the attraction name
     * @param openingTime the opening time
     * @param closingTime the closing time
     * @param shopType the shop type
     */
    public shop(String attractionName, String openingTime, String closingTime, String shopType) {
        super(attractionName, openingTime, closingTime);
        this.shopType = shopType;
        this.objectIdentifier = "Shop";
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
     * @param shopType the shop type
     */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
    
    @Override
    /**
     * to string method for shop
     * @return string for shop
     */
    public String toString() {
        return "Shop, " + super.toString() + ", " + this.getShopType();
    }

    @Override
    /**
     * @return the objectIdentifier
     */
    public String getObjectIdentifier() {
        return objectIdentifier;
    }
  
}
