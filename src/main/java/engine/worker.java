/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

/**
 *this class is one extend type of user
 * 
 */
public class worker extends user {
    
    private String jobPosition;
    private double salary;
    
    public worker(String first, String last, String userName, String password, 
            String email, String jobPosition, double salary) {
        
        super(first, last, userName, password, email);
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    /**
     * @return jobPosition
     */
    public String getJobPosition() {
        return jobPosition;
    }

    /**
     * @param jobPosition
     */
    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    /**
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
