/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import engine.attraction;
import engine.attractionList;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alexkinser
 */
public class parkAttractionsTableModel extends AbstractTableModel {
    
    parkInfoController parkInfoController;
    parksList parksList;
    parkInfo parkInfo;
    String[] columnNames = {"Type","Name", "Opening Time", "Closing Time"};

    /**
    * Constructor for the attractionTableModel class.
    */
    parkAttractionsTableModel(parkInfoController parkInfoController, String identifier, parksList parksList) {
        this.parkInfoController = parkInfoController;
        this.parksList = parksList;
        
        
        for (int i = 0; i < parksList.getParksList().size(); i++) {
            if (parksList.getParksList().get(i).getParkName().equals(identifier)) {
                this.parkInfo = parksList.getParksList().get(i);
                System.out.println("Testing table model");
                break;
            }
        }
    }

    @Override
    /**
    * get the row count.
    * @return the amount of rows
    */
    public int getRowCount() {
        return parkInfo.getAttractionList().getAttractionList().size();
    }

    @Override
    /**
    * @return 3
    */
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    /**
    * Return the column names.
    */
    public String getColumnName(int i) {return columnNames[i];}

    @Override
    /**
    * Fills table with values.
    */
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return (Object) parkInfo.getAttractionList().getAttractionList().get(rowIndex).getObjectIdentifier();
            case 1: return (Object) parkInfo.getAttractionList().getAttractionList().get(rowIndex).getAttractionName();
            case 2: return (Object) parkInfo.getAttractionList().getAttractionList().get(rowIndex).getOpeningTime();
            case 3: return (Object) parkInfo.getAttractionList().getAttractionList().get(rowIndex).getClosingTime();
            default: return null;
        }
    }
}
