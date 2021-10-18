/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactions;

import engine.user;

/**
 *
 * @author alexkinser
 */
public class newTransaction {
    /**
     * to be utilized by the transactionUI in order to create new transactions 
     * new transactions will then be added to the transaction list.
     */
    
    user user;
    transaction transaction;
    transactionList transactionList;
    
    /**
     * Constructor for the newTransaction class.
     * @param user the user
     * @param transaction the transaction
     * @param transactionList the transaction list
     */
    public newTransaction(user user, transaction transaction, transactionList transactionList) {
        this.user = user;
        this.transaction = transaction;
        this.transactionList = transactionList;
        
        implementNewTransaction();
    }

    /**
     * add a new transaction to the specific users transaction list.
     */
    private void implementNewTransaction() {
        //TO DO
        //add the code to add a new transaction to the specific users transaction list
    }
   
}
