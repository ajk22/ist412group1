/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import test.tests1;

/**
 * Main class.
 * @author alexkinser
 */
public class main {
    
    /**
     * Main class... starts program by creating a controller and also runs tests
     */
    public static void main(String[] args) {
        //main method... only thing that needs done in this method is the initialization of the controller
        controller controller = new controller();
        //RUN TESTS IN MAIN
        tests1 tests = new tests1();
    }
}
