/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.dashboard;
import DaO.DaO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.loginmodel;
import view.login;

public class logincontroller {
    loginmodel model;
    login view;
    public logincontroller(login view){
        this.view=view;
        view.loginListner(new loginListener());
    }
    class loginListener implements ActionListener{
        
@Override
        public void actionPerformed(ActionEvent e) {                                          
//        boolean ok= validation();
//        if (ok==false)
//        {
            
//        }
//        else{
             model=view.getUser();
            try {
                DaO.loguser(model);
            } catch (Exception ex) {
                
            }
    }                                         
    }
    }

