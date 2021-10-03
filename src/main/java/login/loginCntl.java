/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import engine.user;
import engine.userList;


/**
 *
 * @author Xiangan Zhu
 */
public class LoginCntl implements ActionListener {

    private userList userList;
    private ArrayList<user> listOfUsers;
    private UserUI userUI;
    private NewUserUI newUserUI;
    private user user;
    

    public LoginCntl() {
        userList = new userList();
        listOfUsers = userList.getUserList();
        createUserUI();
        userUI.setVisible(true);
        createNewUserUI();
    }

    private void createUserUI() {
        userUI = new UserUI(this);
        userUI.cancelBtn.addActionListener(this);
        userUI.signUpBtn.addActionListener(this);
        userUI.loginBtn.addActionListener(this);
    }

    public void createNewUserUI(){
        newUserUI = new NewUserUI();
        newUserUI.cancelBtn.addActionListener(this);
        newUserUI.submitBtn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        boolean found = false;
        if (obj == userUI.loginBtn) {
            String userName = userUI.getUserNameTxt();
            String pw = userUI.getPwTxt();
            for (user listOfUser : listOfUsers) {
                if (listOfUser.getUserName().equals(userName) &&
                        listOfUser.getPassword().equals(pw)) {
                    found = true;
                    userUI.setMessage("");
                    navCntl = new NavigationController();
                    userUI.dispose();
                }
                if (!found) {
                    userUI.setMessage("Invalid User Name and Password!");
                }
            }
        } else if (obj == userUI.signUpBtn) {
            newUserUI.setVisible(true);
            userUI.setVisible(false);
        } else if (obj == userUI.cancelBtn) {
            System.exit(0);
        } else if (obj == newUserUI.submitBtn) {
            user newUser = newUserUI.getNewUser();
            listOfUsers.add(newUser);
            userList.writeUserListFile();
            newUserUI.setVisible(false);
            userUI.setVisible(true);
            newUserUI.setfNameTxt("");
            newUserUI.setlNameTxt("");
            newUserUI.setUserNameTxt("");
            newUserUI.setAddressTxt("");
            newUserUI.setCityTxt("");
            newUserUI.setStateTxt("");
            newUserUI.setZipCodeTxt("");
            newUserUI.setEmailTxt("");
            newUserUI.setPwTxt("");
        } else if (obj == newUserUI.cancelBtn) {
            newUserUI.setVisible(false);
            userUI.setVisible(true);
            newUserUI.setfNameTxt("");
            newUserUI.setlNameTxt("");
            newUserUI.setUserNameTxt("");
            newUserUI.setAddressTxt("");
            newUserUI.setCityTxt("");
            newUserUI.setStateTxt("");
            newUserUI.setZipCodeTxt("");
            newUserUI.setEmailTxt("");
            newUserUI.setPwTxt("");
        }
    }

}
