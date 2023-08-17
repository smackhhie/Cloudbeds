/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DaO.DaO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.dashboard;
import model.emp_infomodel;
import view.emp_info;


public class emp_infoController {
    emp_infomodel model;
    emp_info view;
 public emp_infoController(emp_info view){
         
               this.view=view;
                view.emp_infoListner(new emp_infoListner());
    } 
     boolean validation()
        {
            model=view.getUser();
            
            if ("fname".equals(""))
            {
                JOptionPane.showMessageDialog(null,"please enter name");
                return false;
            }
            
            if ("select" == null)
        {
            JOptionPane.showMessageDialog(null,"please choose");
            return false;
        }
                if ("Sal".equals(""))
            {
                JOptionPane.showMessageDialog(null,"please enter Salary");
                return false;
            }
                if ("Phone".equals(""))
            {
                JOptionPane.showMessageDialog(null,"please enter phone number");
                return false;
            }
//                    if ("Phone".length()!=10)
//            {
//                JOptionPane.showMessageDialog(null,"Phone number should be of 10 digits");
//                return false;
//            }
                    if ("Citizen".equals(""))
            {
            JOptionPane.showMessageDialog(null,"please enter Citizenship number");
            return false;
            }
           else{
//                     try {
//                int salValue = Integer.parseInt("Sal");   
//                } 
//                catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Salary should be integer");
//                return false;
//                }
                return true;
                }
        }
 class emp_infoListner implements ActionListener
    {
  
@Override
        public void actionPerformed(ActionEvent e) {                                          
        boolean ok= validation();
        if (ok==false)
        {
            
        }
        else{
             model=view.getUser();
            try {
                DaO.update(model);
//             JOptionPane.showMessageDialog(null,"Sucessfully Added");
            } catch (Exception ex) {
//                Logger.getLogger(Add_empController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                                         
    }
 }
    }


