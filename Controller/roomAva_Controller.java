/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.roomAva_Model;
import View.roomAva_View;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class roomAva_Controller {
    
    private Connection conn;
    PreparedStatement pst;
    roomAva_Model model;
    roomAva_View view;
    
    public roomAva_Controller(roomAva_View view){
        this.view=view;

    }
     public void populateTableFromDatabase() {
        
        view.getTableModel().setRowCount(0);
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");
            String query = "SELECT * FROM rooms";
            pst = conn.prepareStatement(query);
            ResultSet resultSet = pst.executeQuery();


            while (resultSet.next()) {
                int roomNo = resultSet.getInt("roomNo");
                String roomType = resultSet.getString("room_type");
                int roomRate = resultSet.getInt("room_rate");
                System.out.println("vvv");
                String roomAvailability = resultSet.getString("room_availability");
                String roomStatus = resultSet.getString("room_status");

                // Add the data to the table model
                Object[] rowData = { roomNo, roomType, roomRate, roomAvailability, roomStatus };
                view.getTableModel().addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         System.out.println("hh");
    }
    public void populateRoomNumbers(JComboBox<String> combo) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");
        
        String query = "SELECT roomNo FROM rooms ";
        pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        combo.removeAllItems();
        while (rs.next()) {
            int roomNumber = rs.getInt("roomNo");
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
public void refreshRates(int roomNumber, JTextField txt_rate) {
        roomNumber=view.getSelectedRoomNumber();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");

           
            String query = "SELECT room_rate  FROM rooms WHERE roomNo = '" + roomNumber+ "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String rates = "";
            
            while (rs.next()) {
            int roomRates = rs.getInt("room_rate");
            rates += roomRates + ", ";                

            }
        if (rates.endsWith(", ")) {
            rates = rates.substring(0, rates.length() - 2);
        }

        // Set the customer names in the text field
        txt_rate.setText(rates);
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public void updateStatus(int roomNumber, JComboBox<String> combo_Status) {
    roomNumber = view.getSelectedRoomNumber();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");

        
        String query = "SELECT room_status FROM rooms WHERE roomNo = " + roomNumber;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        
        combo_Status.removeAllItems();

        
        if (rs.next()) {
            String roomStatus = rs.getString("room_status");
            combo_Status.addItem("clean");
            combo_Status.addItem("dirty");
            combo_Status.setSelectedItem(roomStatus);
        } else {
           
            combo_Status.addItem("clean");
            combo_Status.setSelectedItem("clean");
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void updateAvailabilityStatus(int roomNumber, JComboBox<String> comboAvailability) {
    roomNumber = view.getSelectedRoomNumber();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");

        
        String query = "SELECT room_availability FROM rooms WHERE roomNo = " + roomNumber;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        
        comboAvailability.removeAllItems();

        
        if (rs.next()) {
            String roomAvailability = rs.getString("room_availability");
            comboAvailability.addItem("available");
            comboAvailability.addItem("occupied");
            comboAvailability.setSelectedItem(roomAvailability);
        } else {
           
            comboAvailability.addItem("available");
            comboAvailability.setSelectedItem("occupied");
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void updateRoomDetails(roomAva_Model model) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");

        // Update the room details in the database
        String query = "UPDATE rooms SET room_status = ?, room_rate = ?, room_availability = ? WHERE roomNo = ?";
        pst = conn.prepareStatement(query);
        pst.setString(1, model.getStatus());
        pst.setInt(2, model.getRate());
        pst.setString(3,model.getAvailability());
        pst.setInt(4, view.getSelectedRoomNumber());
        pst.executeUpdate();

        pst.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
//   public void updateStatus(int roomNumber, JComboBox<String> combo_Status) {
//       roomNumber=view.getSelectedRoomNumber();
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "pavilion1!");
//
//            // to retrieve available room numbers of the selected type
//            String query = "SELECT room_status FROM rooms WHERE room_type = '" + roomNumber+ "'";
//
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            
//
//            
//            while (rs.next()) {
//                String room_Status = rs.getString("room_status");
//                combo_Status.setSelectedItem(room_Status);
//            }
//            
//            rs.close();
//            stmt.close();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
