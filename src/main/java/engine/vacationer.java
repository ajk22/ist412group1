/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import transactions.transactionList;

/**
 * this class is the extend types of users 
 * 
 */
public class vacationer extends user {
    
    private transactionList transactionList;
    
    public vacationer(String first, String last, String userName, String password, String email) {
        super(first, last, userName, password, email);
        this.transactionList = new transactionList();
    }

    /**
     * @return the list of transactions made by the specific user
     */
    public transactionList getTransactionList() {
        return transactionList;
    }

    /**
     * @param transactionList the list of transactions made by the specific user
     */
    public void setTransactionList(transactionList transactionList) {
        this.transactionList = transactionList;
    }
    
}
