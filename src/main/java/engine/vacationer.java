/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import transactions.transactionList;

/**
 * this class extends user.
 * 
 */
public class vacationer extends user {
    
    private transactionList transactionList;
    
    /**
     * Constructor for the vacationer class.
     * @param first
     * @param last
     * @param userName
     * @param password
     * @param email
     */
    public vacationer(String first, String last, String userName, String password, String email) {
        super(first, last, userName, password, email);
        this.transactionList = new transactionList();
    }

    /**
     * gets the transaction list
     * @return the list of transactions made by the specific user
     */
    public transactionList getTransactionList() {
        return transactionList;
    }

    /**
     * sets the transaction list
     * @param transactionList the list of transactions made by the specific user
     */
    public void setTransactionList(transactionList transactionList) {
        this.transactionList = transactionList;
    }
    
}
