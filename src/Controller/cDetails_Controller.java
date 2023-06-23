/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.cDetails_View;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.sql.*;
import javax.swing.JTextField;

public class cDetails_Controller {
    private Connection conn;
    PreparedStatement pst;
    cDetails_View view;
    
    public cDetails_Controller(cDetails_View view){
        this.view=view;
    }
public void populateRoomNumbers(JComboBox<String> combo) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
        
        String query = "SELECT room_no FROM checkIn_DB";
        pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        combo.removeAllItems();
        while (rs.next()) {
            int roomNumber = rs.getInt("room_no");
            combo.addItem(String.valueOf(roomNumber));
        }
        
        rs.close();
        pst.close();
        conn.close();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public void refreshNames(int roomNumber, JTextField txt_Name) {
        roomNumber=view.getSelectedRoomNumber();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

            // to retrieve available room numbers of the selected type
            String query = "SELECT customer_name  FROM checkIn_DB WHERE room_no = '" + roomNumber+ "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String names = "";
            
            while (rs.next()) {
            String customerName = rs.getString("customer_name");
            names += customerName + ", ";                

            }
        if (names.endsWith(", ")) {
            names = names.substring(0, names.length() - 2);
        }

        // Set the customer names in the text field
        txt_Name.setText(names);
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
