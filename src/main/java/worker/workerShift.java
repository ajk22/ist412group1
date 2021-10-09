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

    public workerShift(String worker, String attraction, String date) {
        this.worker = worker;
        this.attraction = attraction;
        this.date = date;
    }

    /**
     * @return worker
     */
    public String getWorker() {
        return worker;
    }

    /**
     * @param worker
     */
    public void setWorker(String worker) {
        this.worker = worker;
    }

    /**
     * @return worker's attraction where they are working
     */
    public String getAttraction() {
        return attraction;
    }

    /**
     * @param attraction
     */
    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    /**
     * @return worker's date of attraction
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
    
}
