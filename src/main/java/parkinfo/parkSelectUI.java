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
import java.util.HashSet;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author alexkinser
 */
public class parkSelectUI extends JFrame {
    
    private Color white;
    private Color pink;
    private Color black;
    private Color purple;
    private Color blue;
    private LineBorder border1;
    private Font font1;
    private Font font2;
    private JLabel title1;
    private JLabel title2;
    public parkInfoController parkInfoController;
    private JPanel UIPanel;
    private GridBagConstraints layout;
    private JComboBox comboBox;
    private JButton viewButton;
    private JButton exitButton;
    private JPanel buttonPanel;
    
     /**
     * Creates new form parkSelectionUI
     * @param parkInfoController the park info controller
     */
    public parkSelectUI(parkInfoController parkInfoController) {
        this.parkInfoController = parkInfoController;
        white = Color.decode("#fefefa");
        pink = Color.decode("#bb179d");
        black = Color.decode("#030303");
        blue = Color.decode("#3517bb");
        purple = Color.decode("#8717bb");
        
        setTitle("Park Info");
        setSize(500,350);
        setMaximumSize(new Dimension(500,350));
        setMinimumSize(new Dimension(500,350));
        setLocationRelativeTo(null);
        
        border1 = new LineBorder(blue, 6);
        font1 = new Font(null, Font.BOLD, 24);
        font2 = new Font(null, Font.TRUETYPE_FONT, 18);
        
        initComponents();
    }

    private void initComponents() {
        
        UIPanel = new JPanel(new GridBagLayout());
        layout = new GridBagConstraints();
        
        title1 = new JLabel();
        title1.setText("           Wally Land Park Selection           ");
        title1.setBackground(purple);
        title1.setForeground(white);
        title1.setOpaque(true);
        title1.setFont(font1);
        
        layout.gridy = 0;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.CENTER;
        layout.gridheight = 1;
        layout.gridwidth = 1;
        layout.weightx = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,0,0,0);
        UIPanel.add(title1, layout);
        
        title2 = new JLabel();
        title2.setText("  Please select a park and press 'ViewInfo' or press 'Exit'");
        title2.setBackground(pink);
        title2.setForeground(white);
        title2.setOpaque(true);
        title2.setFont(font2);
        
        layout.gridy = 1;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridheight = 1;
        layout.gridwidth = 2;
        layout.weightx = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,0,0,0);
        UIPanel.add(title2, layout);
        
        String parks[]={"Park 1","Park 2","Park 3","Park 4","Park 5"};        
        comboBox = new JComboBox(parks);    
        comboBox.setBounds(50, 50,90,20);  
        comboBox.setSelectedIndex(0);
        layout.gridy = 2;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridheight = 1;
        layout.gridwidth = 2;
        layout.weightx = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,0,0,0);
        UIPanel.add(comboBox, layout);
        
        viewButton = new JButton();
        viewButton.setText("View Park Info");
        viewButton.setOpaque(true);
        viewButton.setForeground(white);
        viewButton.setBackground(pink);
        viewButton.setBorder(border1);
        viewButton.setFont(font2);
        viewButton.addActionListener(event -> viewParkInfo(comboBox.getItemAt(comboBox.getSelectedIndex())));
        layout.gridy = 3;
        layout.gridx = 0;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridheight = 1;
        layout.gridwidth = 1;
        layout.ipadx = 0;
        layout.insets = new Insets(20,20,0,20);
        UIPanel.add(viewButton, layout);
        
        exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setBorder(border1);
        exitButton.setBackground(Color.red);
        exitButton.setForeground(white);
        exitButton.setOpaque(true);
        exitButton.setFont(font2);
        layout.gridy = 4;
        layout.gridx = 0;
        layout.ipady = 20;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.insets = new Insets(20,20,0,20);
        exitButton.addActionListener(event -> exitUI());
        UIPanel.add(exitButton, layout);
        
        UIPanel.setVisible(true);
        getContentPane().add(UIPanel, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void viewParkInfo(Object itemAt) {
        String identifier = "";
        
        if (itemAt.equals("Park 1")) {
            
            identifier = "Park 1";
        } else if (itemAt.equals("Park 2")) {
            
            identifier = "Park 2";
        } else if (itemAt.equals("Park 3")) {
            
            identifier = "Park 3";
        } else if (itemAt.equals("Park 4")) {
            
            identifier = "Park 4";
        } else if (itemAt.equals("Park 5")) {
            
            identifier = "Park 5";
        }
        
        this.setVisible(false);
        parkInfoController.parkInfoVisible(identifier);
        
    }

    private void exitUI() {
        this.setVisible(false);
        parkInfoController.returnToMainUI();
    }

}

