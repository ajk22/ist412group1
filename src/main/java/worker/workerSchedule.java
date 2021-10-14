/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;
import java.util.ArrayList;

/**
 *
 * @author alexkinser
 */
/**
     * a worker schedule is a collection or list of worker shifts
this class will be utilized by the workerProfile class
     */
public class workerSchedule {
    
   private ArrayList<workerShift> Schedule = new ArrayList<>();
   
   /**
    * Constructor for the workerSchedule class.
    * @param Schedule 
    */
    public workerSchedule(ArrayList<workerShift> Schedule) {
        this.Schedule = Schedule;
        
    }

    /**
     * Displays the workers schedule
     * @return schedule, which is a list
     */
    public ArrayList<workerShift> getSchedule() {
        return Schedule;
    }

    /**
     * Sets the workers schedule
     * @param Schedule;
     */
    public void setSchedule(ArrayList<workerShift> Schedule) {
        this.Schedule = Schedule;
    }
   

    
   
}
