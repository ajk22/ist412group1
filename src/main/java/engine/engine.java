/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

    /**this class is for:
     * bulk of project relies on engine and its functions
     * reading and writing data
     * saving and updating information
     * initialize the process of creating all objects and lists.
     */
public class engine {
    
    public attractionList attractionList;
    private userList userList;
    
    /**
     * Constructor for the attractionList class.
     */
    public engine() {
        
        this.userList = new userList();
        this.attractionList = new attractionList();
        //startEngine();
    }

    /**
     * starts the engine... loads data
     */
    private void startEngine() {        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //TO-DO
        //1. Implement methods to load and parse data files to create objects
        //2. Implement methods to save data
        //3. Implement methods to communicate with other parts in the engine
        //4. Implement methods to communicate with the controller
    }

    /**
     * gets the attraction list
     * @return attractionList
     */
    public attractionList getAttractionList() {
        return attractionList;
    }

    /**
     * set the attraction list
     * @param attractionList the attraction list
     */
    public void setAttractionList(attractionList attractionList) {
        this.attractionList = attractionList;
    }

    /**
     * get the user list
     * @return userList
     */
    public userList getUserList() {
        return userList;
    }

    /**
     * set the user list
     * @param userList the user list
     */
    public void setUserList(userList userList) {
        this.userList = userList;
    }
    
}
