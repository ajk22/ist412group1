package admin;

import engine.attraction;
import engine.attractionList;
import engine.ride;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexkinser
 */
public class rideTableModel extends AbstractTableModel {
    
    ArrayList<attraction> attractionList;
    String[] columnNames = {"Name", "Opening Time", "Closing Time"};

    /**
    * Constructor for rideTableModel.
    */
    rideTableModel(attractionList attractionList) {
        this.attractionList = getRides(attractionList);
    }

    @Override
    /**
    * @return the row count
    */
    public int getRowCount() {
        return attractionList.size();
    }

    @Override
    /**
    * @return the column count
    */
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    /**
    * @return the column names
    */
    public String getColumnName(int i) {return columnNames[i];}

    @Override
    /**
    * Fills the table with values.
    */
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return (Object) attractionList.get(rowIndex).getAttractionName();
            case 1: return (Object) attractionList.get(rowIndex).getOpeningTime();
            case 2: return (Object) attractionList.get(rowIndex).getClosingTime();
            default: return null;
        }
    }

    /**
    * creates a list of only rides from all of attractions.
    * @return the list of rides
    * @param attractionList the entire list of attractions
    */
    private ArrayList<attraction> getRides(attractionList attractionList) {
        ArrayList<attraction> tempList = new ArrayList<>();
        
        for (int i = 0; i < attractionList.getAttractionList().size(); i++) {
            if (attractionList.getAttractionList().get(i).getObjectIdentifier().equals(("Ride"))) {
                tempList.add(attractionList.getAttractionList().get(i));
                System.out.println(tempList.get(i).toString());
            }
        }
        
        return tempList;
    }
    
}
