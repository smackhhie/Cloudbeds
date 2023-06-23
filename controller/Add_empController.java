package controller;


import database.FRONT;
//import java.sql.Connection;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import model.*;
import view.*;
import model.update_emp_info;


public class Add_empController {
    Add_empmodel model;
    update_emp_info view;
    public Add_empController(update_emp_info  view)
    {
        this.view=view;
        view.addRegister(new Add_empListener());
        
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
                    if ("Phone".length()!=10)
            {
                JOptionPane.showMessageDialog(null,"Phone number should be of 10 digits");
                return false;
            }
                    if ("Citizen".equals(""))
            {
            JOptionPane.showMessageDialog(null,"please enter Citizenship number");
            return false;
            }
           else{
                     try {
                int salValue = Integer.parseInt("Sal");   
                } 
                catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salary should be integer");
                return false;
                }
                return true;
                }
        }
    
    public boolean ok(){                                          
        boolean ok= validation();
        if (ok==false)
        {
            
        }
        else{
        Connection conn = FRONT.dbConnect();
                try{
                    String selectedValue = "";
                if (btnmale.isSelected()) {
                    selectedValue = btnmale.getText();
                } else if (btnfemale.isSelected()) {
                    selectedValue = btnfemale.getText();
                } else if (btnothers.isSelected()) {
                    selectedValue = btnothers.getText();
                }
            Statement stmt=conn.createStatement();
            String sql="insert into addemp values('"+txtname.getText()+"','"+selectedValue+"','"+txtselect.getSelectedItem()+"','"+salary.getText()+"','"+phone.getText()+"','"+citizenno.getText()+"')";
                    stmt.executeUpdate(sql);
                    System.out.println("Data inserted");
                    JOptionPane.showMessageDialog(null,"Sucessfully Added");
                    new update_emp_info().setVisible(false);
                    dispose();
                    new dashboard().setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }                                         
    }
}
