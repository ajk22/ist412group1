/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import engine.attraction;
import engine.attractionList;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alexkinser
 */
public class attractionTableModel extends AbstractTableModel {
    
    ArrayList<attraction> attractionList;
    String[] columnNames = {"Name", "Opening Time", "Closing Time"};

    /**
    * Constructor for the attractionTableModel class.
    */
    attractionTableModel(attractionList attractionList) {
        this.attractionList = attractionList.getAttractionList();
        System.out.println("testing...");
    }

    @Override
    /**
    * get the row count.
    * @return the amount of rows
    */
    public int getRowCount() {
        return attractionList.size();
    }

    @Override
    /**
    * @return 3
    */
    public int getColumnCount() {
        return 3;
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
            case 0: return (Object) attractionList.get(rowIndex).getAttractionName();
            case 1: return (Object) attractionList.get(rowIndex).getOpeningTime();
            case 2: return (Object) attractionList.get(rowIndex).getClosingTime();
            default: return null;
        }
    }
    
}
