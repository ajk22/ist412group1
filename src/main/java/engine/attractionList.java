/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.util.ArrayList;

/**
 * this class is a the list of attraction objects
 * @author alexkinser
 */
public class attractionList {
    
    private ArrayList<attraction> attractionList;
    
    /**
     * Constructor for the attractionList class.
     */
    public attractionList() {
        this.attractionList = new ArrayList<>();
    }

    /**
     * get the attraction list
     * @return attractionList
     */
    public ArrayList<attraction> getAttractionList() {
        return attractionList;
    }

    /**
     * set the attraction list
     * @param attractionList the attraction list
     */
    public void setAttractionList(ArrayList<attraction> attractionList) {
        this.attractionList = attractionList;
    }
    
    /**
     * add an attraction to the list
     * @param attraction the attraction
     */
    public void addAttraction(attraction attraction) {
        attractionList.add(attraction);
        //sets list to a properly sorted list
        setAttractionList(this.sortList());
    }
    
    /**
     * sorts the attraction list
     * @return attractionList
     */
    public ArrayList<attraction> sortList() {
        //TO DO
        return attractionList;
    }
    
}
