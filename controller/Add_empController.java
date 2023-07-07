package controller;


import DaO.DaO;
import database.FRONT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import view.*;
import model.update_emp_info;


public class Add_empController {
    Add_empmodel model;
    Add_emp view;
    public Add_empController(Add_emp  view)
    {
        this.view=view;
        view.Add_empListner(new Add_empListener());
        
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
 class Add_empListener implements ActionListener
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
                if(DaO.checkUser(model))
                {
                    JOptionPane.showMessageDialog(null,"Sucessfully Added");

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Error");
                    
                    
                }
   
//      JOptionPane.showMessageDialog(null,"Sucessfully Added");
            } catch (Exception ex) {
                Logger.getLogger(Add_empController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                                         
    }
 }
    }
