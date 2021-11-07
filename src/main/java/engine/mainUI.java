/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

   /**
     * main method UI .
     * this is where the user will enter other areas of the application where actual functionality is located
     */
public class mainUI extends JFrame {
    
    private controller controller;
    public Color white;
    public Color pink;
    public Color black;
    public Color purple;
    public Color blue;
    private JPanel topMenuPanel;
    public Font font1;
    public Font font2;
    private GridBagConstraints layout;
    public JLabel title;
    private JLabel adminlabel;
    private JLabel parkInfoLabel;
    private JLabel parkMapLabel;
    private JLabel shopLabel;
    private JLabel plannerLabel;
    private final Dimension button1;
    private final Border border1;
    private JButton adminButton;
    private JButton parkInfoButton;
    private JButton settingsButton;
    private JButton shopButton;
    private JButton plannerButton;
    private GridBagConstraints layout2;

    /**
     * Populates the interface.
     * @param controller the engine controller
     */
    public mainUI(controller controller) {
        this.controller = controller;
        white = Color.decode("#fefefa");
        pink = Color.decode("#bb179d");
        black = Color.decode("#030303");
        blue = Color.decode("#3517bb");
        purple = Color.decode("#8717bb");
                
        border1 = new LineBorder(blue, 6);
        font1 = new Font(null, Font.BOLD, 24);
        font2 = new Font(null, Font.TRUETYPE_FONT, 18);
        button1 = new Dimension(200,80);

        UIcomponents();
    }

    /**
     * Populates the interface.
     */
    private void UIcomponents() {
        setTitle("Wally Land");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(500,500));
        setMinimumSize(new Dimension(500, 500));
        setBackground(white);

        topMenuPanel = new JPanel(new GridBagLayout());
        layout = new GridBagConstraints();

        title = new JLabel();
        title.setText("                      Wally Land                      ");
        title.setForeground(white);
        title.setBackground(purple);
        title.setOpaque(true);
        title.setFont(font1);
        layout.gridy = 0;
        layout.gridx = 0;
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridwidth = 1;
        layout.gridheight = 1;
        layout.weightx = 1;
        layout.ipady = 20;
        layout.ipadx = 0;
        layout.insets = new Insets(0, 0, 0, 0);
        topMenuPanel.add(title, layout);

        //add customer label
        layout.insets = new Insets(40,20,0,20);
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridx = 0;
        layout.gridy = 1;
        layout.gridwidth = 1;
        layout.weightx = 1;
        layout.ipady = 0;
        layout.ipadx = 0;
        adminButton = new JButton();
        adminButton.setFont(font2);
        adminButton.setForeground(white);
        adminButton.setBackground(pink);
        adminButton.setOpaque(true);
        adminButton.setBorder(border1);
        adminButton.setText(" Admin ");
        topMenuPanel.add(adminButton, layout);
        adminButton.addActionListener(event -> adminSelected());

        //edit customer label
        layout.gridy = 2;
        parkInfoButton = new JButton();
        parkInfoButton.setFont(font2);
        parkInfoButton.setForeground(white);
        parkInfoButton.setBackground(pink);
        parkInfoButton.setOpaque(true);
        parkInfoButton.setBorder(border1);
        parkInfoButton.setText(" Park Info ");
        topMenuPanel.add(parkInfoButton, layout);
        parkInfoButton.addActionListener(event -> parkInfoSelected());

        //new sale label
        layout.gridy = 3;
        settingsButton = new JButton();
        settingsButton.setFont(font2);
        settingsButton.setForeground(white);
        settingsButton.setBackground(pink);
        settingsButton.setOpaque(true);
        settingsButton.setBorder(border1);
        settingsButton.setText(" Settings ");
        topMenuPanel.add(settingsButton, layout);
        settingsButton.addActionListener(event -> settingsSelected());

        //edit sale label
        layout.gridy = 4;
        shopButton = new JButton();
        shopButton.setFont(font2);
        shopButton.setForeground(white);
        shopButton.setBackground(pink);
        shopButton.setOpaque(true);
        shopButton.setBorder(border1);
        shopButton.setText(" Shop ");
        shopButton.setSize(300, 40);
        topMenuPanel.add(shopButton, layout);
        shopButton.addActionListener(event -> shopSelected());

        //view sale label
        layout.gridy = 5;
        plannerButton = new JButton();
        plannerButton.setFont(font2);
        plannerButton.setForeground(white);
        plannerButton.setBackground(pink);
        plannerButton.setOpaque(true);
        plannerButton.setBorder(border1);
        plannerButton.setText(" Planner ");
        topMenuPanel.add(plannerButton, layout);
        plannerButton.addActionListener(event -> plannerSelected());


        topMenuPanel.setVisible(true);
        getContentPane().add(topMenuPanel, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Admin menu selected.
     */
    private void adminSelected() {
        controller.adminSelectedFromMain();
    }

    /**
     * Park info menu selected.
     */
    private void parkInfoSelected() {
        controller.parkInfoSelectedFromMain();
    }

    /**
     * Planner menu selected.
     */
    private void plannerSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Shop menu selected.
     */
    private void shopSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Settings menu selected.
     */
    private void settingsSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
