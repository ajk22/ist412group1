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
     * @param first the first name
     * @param last the last name
     * @param userName the user name
     * @param password the password
     * @param email the email
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
    
    @Override
    /**
     * to string method for vacationer
     * @return string for vacationer
     */
    public String toString() {
        
        String temp = super.toString();
        String type = "Vacationer, ";
        
        return type.concat(temp);
    }
    
}
