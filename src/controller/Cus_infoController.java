/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.dashboard;
import DaO.DaO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cus_infomodel;
import view.Cus_info;

public class Cus_infoController {
    Cus_infomodel model;
    Cus_info view;
    public Cus_infoController(Cus_info view)
            {
        this.view=view;
        view.Cus_infoListner(new Cus_infoListener());
    }

     class Cus_infoListener implements ActionListener
    {
  
@Override
        public void actionPerformed(ActionEvent e) {                                          
//        boolean ok= validation();
//        if (ok==false)
//        {
//            
//        }
//        else{
             model=view.getUser();
            try {
                DaO.cusinfoUser(model);
             JOptionPane.showMessageDialog(null,"Sucessfully Added");
             new dashboard().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Add_empController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }                                         
    }
 }
//}
