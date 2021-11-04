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
    
    public ArrayList<parkInfo> parksList;
    
    public parksList() {
        this.parksList = new ArrayList<>();
    }
    
    public void addPark(String[] park, attractionList attractionList) {
        parksList.add(new parkInfo(park[0], park[1], park[2], attractionList));
    }
    
    
}
