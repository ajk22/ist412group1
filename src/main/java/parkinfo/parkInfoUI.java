/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinfo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 * starting UI or home screen of the application
     * to be presented before login or main menu
     * the home page class
     */
public class parkInfoUI extends JFrame {
    
    private parkInfoController parkInfoController;
    private JPanel UIPanel;
    private GridBagConstraints layout;
    private JButton rideButton;
    private JButton restaurantButton;
    private JButton eventButton;
    private JButton shopButton;
    private final Color white;
    private final Color pink;
    private final Color black;
    private final Color purple;
    private final Color blue;
    private JLabel title1;
    private JLabel title2;
    private JTable attractionsTable;
    private JButton resetButton;
    private JButton exitButton;
    private LineBorder border1;
    private Font font1;
    private Font font2;
    private parkAttractionsTableModel parkAttractionsTableModel;
    
    
    public parkInfoUI(parkInfoController parkInfoController, parkAttractionsTableModel parkAttractionsTableModel, String identifier) {
        //TO DO
        //initialize the panel size and other settings
        this.parkAttractionsTableModel = parkAttractionsTableModel;
        this.attractionsTable = new JTable(this.parkAttractionsTableModel);
        this.parkInfoController = parkInfoController;
        white = Color.decode("#fefefa");
        pink = Color.decode("#bb179d");
        black = Color.decode("#030303");
        blue = Color.decode("#3517bb");
        purple = Color.decode("#8717bb");
        
        initComponents(identifier);
    }

    private void initComponents(String identifier) {
        //TO DO
        //modify and place JComponents into the UI
        
        setTitle("Park Info");
        setSize(800,820);
        setMaximumSize(new Dimension(800,820));
        setMinimumSize(new Dimension(800,820));
        setLocationRelativeTo(null);
        
        border1 = new LineBorder(blue, 6);
        font1 = new Font(null, Font.BOLD, 24);
        font2 = new Font(null, Font.TRUETYPE_FONT, 18);
        
        UIPanel = new JPanel(new GridBagLayout());
        layout = new GridBagConstraints();
        
        title1 = new JLabel();
        title1.setText("                           Wally Land Attractions: " + identifier);
        title1.setBackground(purple);
        title1.setForeground(white);
        title1.setOpaque(true);
        title1.setFont(font1);
        
        layout.gridy = 0;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridheight = 1;
        layout.gridwidth = 1;
        layout.weightx = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,0,0,0);
        UIPanel.add(title1, layout);
        
        title2 = new JLabel();
        title2.setText("                                                       All Attractions");
        title2.setBackground(pink);
        title2.setOpaque(true);
        title2.setForeground(white);
        title2.setFont(font2);
        
        layout.gridy = 1;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridheight = 1;
        layout.gridwidth = 1;
        layout.weightx = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,0,0,0);
        UIPanel.add(title2, layout);
        
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
        layout.gridy = 2;
        UIPanel.add(tablePanel, layout);
        
        UIPanel.setVisible(true);
        getContentPane().add(UIPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel filterButtonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints layout2 = new GridBagConstraints();
        
        restaurantButton = new JButton();
        restaurantButton.setText("Restaurants");
        restaurantButton.setOpaque(true);
        restaurantButton.setForeground(white);
        restaurantButton.setBackground(pink);
        restaurantButton.setBorder(border1);
        restaurantButton.setFont(font2);
        layout2.gridy = 0;
        layout2.gridx = 0;
        layout2.insets = new Insets(20, 20, 0, 20);
        restaurantButton.addActionListener(event -> filterRestaurants(identifier));
        filterButtonPanel.add(restaurantButton, layout2);
        
        rideButton = new JButton();
        rideButton.setText("    Rides    ");
        rideButton.setOpaque(true);
        rideButton.setForeground(white);
        rideButton.setBackground(pink);
        rideButton.setBorder(border1);
        rideButton.setFont(font2);
        layout2.gridy = 0;
        layout2.gridx = 1;
        layout2.insets = new Insets(20, 20, 0, 20);
        rideButton.addActionListener(event -> filterRides(identifier));
        filterButtonPanel.add(rideButton, layout2);
        
        eventButton = new JButton();
        eventButton.setText("   Events   ");
        eventButton.setOpaque(true);
        eventButton.setForeground(white);
        eventButton.setBackground(pink);
        eventButton.setBorder(border1);
        eventButton.setFont(font2);
        layout2.gridy = 0;
        layout2.gridx = 2;
        layout2.insets = new Insets(20, 20, 0, 20);
        eventButton.addActionListener(event -> filterEvents(identifier));
        filterButtonPanel.add(eventButton, layout2);
        
        shopButton = new JButton();
        shopButton.setText("    Shops    ");
        shopButton.setOpaque(true);
        shopButton.setForeground(white);
        shopButton.setBackground(pink);
        shopButton.setBorder(border1);
        shopButton.setFont(font2);
        layout2.gridy = 0;
        layout2.gridx = 3;
        layout2.insets = new Insets(20, 20, 0, 20);
        shopButton.addActionListener(event -> filterShops(identifier));
        filterButtonPanel.add(shopButton, layout2);

        layout.gridy = 3;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.insets = new Insets(0, 20, 0, 20);
        UIPanel.add(filterButtonPanel, layout);
        
        resetButton = new JButton();
        resetButton.setText("Reset Table");
        resetButton.setOpaque(true);
        resetButton.setForeground(white);
        resetButton.setBackground(pink);
        resetButton.setBorder(border1);
        resetButton.setFont(font2);
        layout.gridy = 4;
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
        layout.gridy = 5;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.insets = new Insets(20, 300, 0, 300);
        exitButton.addActionListener(event -> exitUI());
        UIPanel.add(exitButton, layout);
        
        UIPanel.setVisible(true);
        getContentPane().add(UIPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void filterRestaurants(String identifier) {
        attractionsTable.setModel(parkInfoController.setAsRestaurantTableModel(identifier));
    }

    private void resetTable() {
        attractionsTable.setModel(parkAttractionsTableModel);
    }

    private void exitUI() {
        this.setVisible(false);
        parkInfoController.setVisible();
    }

    private void filterRides(String identifier) {
        attractionsTable.setModel(parkInfoController.setAsRidesTableModel(identifier));
    }

    private void filterEvents(String identifier) {
        attractionsTable.setModel(parkInfoController.setAsEventsTableModel(identifier));
    }

    private void filterShops(String identifier) {
        attractionsTable.setModel(parkInfoController.setAsShopTableModel(identifier));
    }
    
    
}