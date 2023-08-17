package controller;


import view.dashboard;
import DaO.DaO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Addempmodel;
import view.Add_emp;


public class Add_empController {
    Addempmodel model;
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
                DaO.checkUser(model);
             JOptionPane.showMessageDialog(null,"Sucessfully Added");
             new dashboard().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Add_empController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                                         
    }
 }
    }
