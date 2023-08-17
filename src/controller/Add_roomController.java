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
import model.Add_roommodel;
import view.Add_room;

public class Add_roomController {
        Add_roommodel model;
    Add_room view;
    public Add_roomController(Add_room  view)
    {
        this.view=view;
        view.Add_roomListner(new Add_roomListener());
    }
    class Add_roomListener implements ActionListener
    {
  
@Override
        public void actionPerformed(ActionEvent e) {                                          

             model=view.getUser();
            try {
                DaO.roomUser(model);
             JOptionPane.showMessageDialog(null,"Sucessfully Added");
             new dashboard().setVisible(true);
            } catch (Exception ex) {
            }                                        
    }
 }
}
