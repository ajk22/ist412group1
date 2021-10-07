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
     * the list of attraction objects
     */
    public attractionList() {
        this.attractionList = new ArrayList<>();
    }

    /**
     * @return
     */
    public ArrayList<attraction> getAttractionList() {
        return attractionList;
    }

    /**
     * @param attractionList
     */
    public void setAttractionList(ArrayList<attraction> attractionList) {
        this.attractionList = attractionList;
    }
    
    /**
     * @param attraction
     */
    public void addAttraction(attraction attraction) {
        attractionList.add(attraction);
        //sets list to a properly sorted list
        setAttractionList(this.sortList());
    }
    
    public ArrayList<attraction> sortList() {
        //TO DO
        return attractionList;
    }
    
}
