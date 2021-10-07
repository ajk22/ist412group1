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
     * initialize the process of creating all objects and lists
     */
public class engine {
    
    private attractionList attractionList;
    private userList userList;
    
    public engine() {
        
        this.userList = new userList();
        this.attractionList = new attractionList();
        startEngine();
    }

    private void startEngine() {        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //TO-DO
        //1. Implement methods to load and parse data files to create objects
        //2. Implement methods to save data
        //3. Implement methods to communicate with other parts in the engine
        //4. Implement methods to communicate with the controller
    }

    /**
     * @return attractionList
     */
    public attractionList getAttractionList() {
        return attractionList;
    }

    /**
     * @param attractionList
     */
    public void setAttractionList(attractionList attractionList) {
        this.attractionList = attractionList;
    }

    /**
     * @return userList
     */
    public userList getUserList() {
        return userList;
    }

    /**
     * @param userList
     */
    public void setUserList(userList userList) {
        this.userList = userList;
    }
    
}
