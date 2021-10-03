/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Xiangan Zhu
 */
public class userList {
    ArrayList<user> userList = new ArrayList<>();
    private String userFileName = "users.ser";
    
    public userList() {
        readUserListFile();
        if (userList.isEmpty() || userList == null) {
            createList();
            writeUserListFile();
            readUserListFile();
        }
        printUserList();
    }

    public void createList() {
        user u1 = new user( "tomsmith@icloud.com", "123456");
        user u2 = new user( "tomsmith@icloud.com", "111111");
        user u3 = new user( "tomsmith@icloud.com", "123123");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
    }

    public void readUserListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(userFileName);
            in = new ObjectInputStream(fis);
            userList = (ArrayList) in.readObject();
            in.close();
            if (!userList.isEmpty()) {
                System.out.println("There were products in the file.");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found, new one was created.");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void writeUserListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(userFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(userList);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void printUserList() {
        for (user user : userList) {
            System.out.println(user.toString());
        }
    }

    public ArrayList<user> getUserList() {
        return userList;
    }
}
