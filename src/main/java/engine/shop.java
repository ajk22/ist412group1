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
public class shop {
    public String address;
    //extends attraction

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public shop(String address) {
        this.address = address;
    }
}
