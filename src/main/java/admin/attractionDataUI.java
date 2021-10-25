/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author alexkinser
 */
public class attractionDataUI extends JFrame {
    
    private final adminController adminController;
    public Color white;
    public Color pink;
    public Color black;
    public Color purple;
    public Color blue;
    private JPanel UIPanel;
    public Font font1;
    public Font font2;
    private GridBagConstraints layout;
    public JLabel title;
    private JTable attractionsTable;
    private JButton filterRidesButton;
    private JButton resetButton;
    private JButton exitButton;
    private LineBorder border1;
    
    /**
    * UI Constructor.
    * @param adminController the admin controller class
    */
    public attractionDataUI(adminController adminController) {
        this.adminController = adminController;
        white = Color.decode("#fefefa");
        pink = Color.decode("#bb179d");
        black = Color.decode("#030303");
        blue = Color.decode("#3517bb");
        purple = Color.decode("#8717bb");
        
        initComponents();
    }

    /**
    * Fills the UI with components.
    */
    private void initComponents() {
        setTitle("Admin Menu");
        setSize(800,800);
        setMaximumSize(new Dimension(800,800));
        setMinimumSize(new Dimension(800,800));
        setLocationRelativeTo(null);
        
        border1 = new LineBorder(blue, 6);
        font1 = new Font(null, Font.BOLD, 24);
        font2 = new Font(null, Font.TRUETYPE_FONT, 18);
        
        UIPanel = new JPanel(new GridBagLayout());
        layout = new GridBagConstraints();
        
        title = new JLabel();
        title.setText("                                   Wally Land Admin Menu");
        title.setBackground(purple);
        title.setForeground(white);
        title.setOpaque(true);
        title.setFont(font1);
        
        layout.gridy = 0;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridheight = 1;
        layout.gridwidth = 1;
        layout.weightx = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,0,0,0);
        UIPanel.add(title, layout);
        
        attractionsTable = new JTable(adminController.getAttractionTableModel());
        JScrollPane tableScroller = new JScrollPane(attractionsTable);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setWheelScrollingEnabled(true);
        tableScroller.setViewportView(attractionsTable);
        JPanel tablePanel = new JPanel();
        tablePanel.add(tableScroller);
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.ipady = 0;
        layout.ipadx = 0;
        layout.ipady = 20;
        layout.gridy = 1;
        UIPanel.add(tablePanel, layout);
        
        filterRidesButton = new JButton();
        filterRidesButton.setText("Filter Rides");
        filterRidesButton.setOpaque(true);
        filterRidesButton.setForeground(white);
        filterRidesButton.setBackground(pink);
        filterRidesButton.setBorder(border1);
        filterRidesButton.setFont(font2);
        layout.gridy = 2;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.insets = new Insets(20, 300, 0, 300);
        filterRidesButton.addActionListener(event -> filterRides());
        UIPanel.add(filterRidesButton, layout);
        
        resetButton = new JButton();
        resetButton.setText("Reset Table");
        resetButton.setOpaque(true);
        resetButton.setForeground(white);
        resetButton.setBackground(pink);
        resetButton.setBorder(border1);
        resetButton.setFont(font2);
        layout.gridy = 3;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.insets = new Insets(20, 300, 0, 300);
        resetButton.addActionListener(event -> resetTable());
        UIPanel.add(resetButton, layout);
        
        exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setBorder(border1);
        exitButton.setBackground(Color.red);
        exitButton.setForeground(white);
        exitButton.setOpaque(true);
        layout.gridy = 4;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.insets = new Insets(20, 300, 0, 300);
        exitButton.addActionListener(event -> exitUI());
        UIPanel.add(exitButton, layout);
        
        UIPanel.setVisible(true);
        getContentPane().add(UIPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
    * Asks the controller for ride table model.
    */
    private void filterRides() {
        attractionsTable.setModel(adminController.getRideTableModel());
        
    }

    /**
    * Asks the controller for attraction table model.
    */
    private void resetTable() {
        attractionsTable.setModel(adminController.getAttractionTableModel());
    }

    /**
    * Exit the UI.
    */
    private void exitUI() {
        this.setVisible(false);
    }
    
}
