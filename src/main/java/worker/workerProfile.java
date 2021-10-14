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
    
    /**
     * Constructor for the workerProfile class
     * @param workerFirstName The first name of the worker
     * @param workerLastName The last name of the worker
     * @param workerEmail The email of the worker
     */
    public workerProfile(String workerFirstName, String workerLastName, String workerEmail) {
        this.workerFirstName = workerFirstName;
        this.workerLastName = workerLastName;
        this.workerEmail = workerEmail;
        this.schedule = schedule;
        
    }

    /**
     * Displays the workers first name
     * @return worker's first name
     */
    public String getWorkerFirstName() {
        return workerFirstName;
    }

    /**
     * Sets the workers first name
     * @param workerFirstName First name of the worker
     */
    public void setWorkerFirstName(String workerFirstName) {
        this.workerFirstName = workerFirstName;
    }
    /**
     * Displays the users last name
     * @return worker's last name
     */

    public String getWorkerLastName() {
        return workerLastName;
    }

    /**
     * Sets the workers last name
     * @param workerLastName The last name of the worker
     */
    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }
    /**
     * Displays the workers email
     * @return worker's email
     */

    public String getWorkerEmail() {
        return workerEmail;
    }

    /**
     * Sets the workers email
     * @param workerEmail The email of the worker
     */
    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    /**
     * Displays the workers schedule
     * @return worker's schedule
     */
    public workerSchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the workers schedule.
     * @param schedule The schedule of the worker
     */
    public void setSchedule(workerSchedule schedule) {
        this.schedule = schedule;
    }

    
           
    
}
