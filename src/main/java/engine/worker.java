/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 * this class extends user.
 * 
 */
public class worker extends user {
    
    private String jobPosition;
    private double salary;
    
    /**
     * Constructor for the worker class.
     * @param first
     * @param last
     * @param userName
     * @param password
     * @param email
     * @param jobPosition
     * @param salary
     */
    public worker(String first, String last, String userName, String password, 
            String email, String jobPosition, double salary) {
        
        super(first, last, userName, password, email);
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    /**
     * gets the workers job position
     * @return jobPosition
     */
    public String getJobPosition() {
        return jobPosition;
    }

    /**
     * sets the workers job position
     * @param jobPosition
     */
    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    /**
     * gets the workers salary
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * sets the workers salary
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
