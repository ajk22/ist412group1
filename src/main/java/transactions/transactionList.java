/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactions;

import java.util.ArrayList;

/**
 *
 * @author alexkinser
 */
public class transactionList {
    
    /**
     * a class or list of transaction objects.
     */
    private ArrayList<transaction> transactionList;
    
    /**
     * Constructor for the transactionList class.
     */
    public transactionList() {
        this.transactionList = new ArrayList<>();
    }

    /**
     * @return transactionList
     */
    public ArrayList<transaction> getTransactionList() {
        return transactionList;
    }

    /**
     * @param transactionList
     */
    public void setTransactionList(ArrayList<transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
