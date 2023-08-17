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
import model.registermodel;
import view.register;

public class registerController {
        registermodel model;
        register view;
    public registerController(register view){
        this.view=view;
        view.registerListner(new registerListener());
    }
    class registerListener implements ActionListener{
        
@Override
        public void actionPerformed(ActionEvent e) {                                          
//        boolean ok= validation();
//        if (ok==false)
//        {
            
//        }
//        else{
             model=view.getUser();
            try {
                DaO.registeruser(model);
            } catch (Exception ex) {
                
            }
    }                                         
    }
}
