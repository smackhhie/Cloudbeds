/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Craze
 */
public class billdao {
    public static String getId() {
        int id = 1;
        try{
            ResultSet rs = DbOperations.getdata("select max(id) from bill");
            if(rs.next(){
                id = rs.getInt(1);
                id = id +1;
                
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return String.valueOf(id);
    }
    public static void save (Bill bill) {
        String query  = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobileNumber()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.Createdby()+"')";
        DbOperations.setDataOrDelete(query, "Bill Details Added Successfully");
    }
    
}
