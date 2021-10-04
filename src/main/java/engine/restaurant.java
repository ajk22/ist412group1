/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 *
 * @author alexkinser
 */
public class restaurant {
    public String address, food;
    /**
     * address = adress of the restaurant
     * food = food in the restaurant
     * @param address
     * @param food 
     */
    //extends attraction

    public restaurant(String address, String food) {
        this.address = address;
        this.food = food;
    }
    /**
     * default constructor
     * @return 
     */

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
