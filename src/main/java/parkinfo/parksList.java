/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import engine.attractionList;
import java.util.ArrayList;

/**
 *
 * @author alexkinser
 */
public class parksList {
    
    private ArrayList<parkInfo> parksList;
    public parkInfoController parkInfoController;
    
    public parksList(parkInfoController parkInfoController) {
        this.parksList = new ArrayList<>();
        this.parkInfoController = parkInfoController;
    }
    
    public void addPark(String[] park, attractionList attractionList) {
       ArrayList<parkInfo> tempList = new ArrayList<>();
       tempList = getParksList();
       tempList.add(new parkInfo(park[0], park[1], park[2], attractionList));
       setParksList(tempList);
        
        System.out.println("Park Added");
    }

    /**
     * @return the parksList
     */
    public ArrayList<parkInfo> getParksList() {
        return parksList;
    }

    /**
     * @param parksList the parksList to set
     */
    public void setParksList(ArrayList<parkInfo> parksList) {
        this.parksList = parksList;
    }

    public void loadParks() {
        parkInfoController.loadParks();
    }
    
    
    
}
