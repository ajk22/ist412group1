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
public class workerShift {
    
    /**
     * a workers schedule is made up of multiple worker shifts
    worker shifts need a worker, an attraction where they are working, a date and a time
     */
    private String worker;
    private String attraction;
    private String date;
    
    /**
     * Constructor for the workerShift class
     * @param worker worker
     * @param attraction attraction
     * @param date date
     */
    public workerShift(String worker, String attraction, String date) {
        this.worker = worker;
        this.attraction = attraction;
        this.date = date;
    }

    /**
     * Displays the workers name
     * @return worker
     */
    public String getWorker() {
        return worker;
    }

    /**
     * Sets the workers role
     * @param worker worker
     */
    public void setWorker(String worker) {
        this.worker = worker;
    }

    /**
     * Displays the attraction that worker is working at.
     * @return worker's attraction where they are working
     */
    public String getAttraction() {
        return attraction;
    }

    /**
     * Sets the attraction that the worker is working at.
     * @param attraction attraction
     */
    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    /**
     * Displays the date the worker worked at an attraction
     * @return worker's date of attraction
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date that the worker works at an attraction. 
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }
    
}
