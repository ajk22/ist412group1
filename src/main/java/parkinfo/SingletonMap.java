/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

/**
 *
 * @author nzp126
 */
public class SingletonMap {
    
    public void main(String[] args)
    {
        
    }

    
}
class ParkMap{
    
    
    String attractionName;
    String openingTime;
    String closingTime;
    String rideType;
    double rideDuration;
    int intensityRating;
    
    static ParkMap map = new ParkMap();
    
    private ParkMap(){
    }

    
    public static ParkMap getInstance(){
        return map;
    }
}
