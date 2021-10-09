/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author alexkinser
 */
 /**
    * creates a worker profile based off of a given worker/users login information
      assure that the user is in fact a worker before making the profile
      a worker profile needs a worker and also needs a workers schedule
    
    */
    
public class workerProfile {
    
   private String workerFirstName;
    private String workerLastName;
    private String workerEmail;
    private workerSchedule schedule;
    

    public workerProfile(String workerFirstName, String workerLastName, String workerEmail) {
        this.workerFirstName = workerFirstName;
        this.workerLastName = workerLastName;
        this.workerEmail = workerEmail;
        this.schedule = schedule;
        
    }

    /**
     * @return worker's first name
     */
    public String getWorkerFirstName() {
        return workerFirstName;
    }

    /**
     * @param workerFirstName
     */
    public void setWorkerFirstName(String workerFirstName) {
        this.workerFirstName = workerFirstName;
    }
    /**
     * @return worker's last name
     */

    public String getWorkerLastName() {
        return workerLastName;
    }

    /**
     * @param workerLastName
     */
    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }
    /**
     * @return worker's email
     */

    public String getWorkerEmail() {
        return workerEmail;
    }

    /**
     * @param workerEmail
     */
    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    /**
     * @return worker's schedule
     */
    public workerSchedule getSchedule() {
        return schedule;
    }

    /**
     * @param schedule
     */
    public void setSchedule(workerSchedule schedule) {
        this.schedule = schedule;
    }

    
           
    
}
