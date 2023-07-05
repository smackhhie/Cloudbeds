package Controller;

import Model.roomAva_Model;
import View.roomAva_View;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;

public class roomAva_Controller {

    private Connection conn;
    PreparedStatement pst;
    roomAva_Model model;
    roomAva_View view;

    public roomAva_Controller(roomAva_View view) {
        this.view = view;
        view.updateRoom(new UpdateListener());

//        this.model = new roomAva_Model(view.getSelectedAvai(), view.getSelectedclean(), view.getSelectedRoomNumber(), view.getRate());
    }

    class UpdateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getData();
                if (validateFields(model)) {
                    if (userRegister(model)) {
                        //view.showMessage("Successfully data inserted");
                    } else {
                        //view.showMessage("Not entered");
                    }
                } else {
                    view.showMessage("Please fill in all the fields");
                }
            } catch (Exception e1) {
                System.out.println("Error: " + e1.getMessage());
            }
        }
    }
//Populate Table-------------------------------------------------------------------------------------------------------    

    public void populateTableFromDatabase() {

        view.getTableModel().setRowCount(0);

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
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
                int Package_Rate = resultSet.getInt("package_rate");

                // Add the data to the table model
                Object[] rowData = {roomNo, roomType, roomRate, roomAvailability, roomStatus, Package_Rate};
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
//----------------------------------------------------------------------------------------------------------------------

    public void populateRoomNumbers(JComboBox<String> combo) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

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
        roomNumber = view.getSelectedRoomNumber();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

            String query = "SELECT room_rate  FROM rooms WHERE roomNo = '" + roomNumber + "'";

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

    public void refreshPackageRates(int roomNumber, JTextField txt_prate) {
        roomNumber = view.getSelectedRoomNumber();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

            String query = "SELECT package_rate  FROM rooms WHERE roomNo = '" + roomNumber + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String rates = "";

            while (rs.next()) {
                int pakroomRates = rs.getInt("package_rate");
                rates += pakroomRates + ", ";

            }
            if (rates.endsWith(", ")) {
                rates = rates.substring(0, rates.length() - 2);
            }

            // Set the customer names in the text field
            txt_prate.setText(rates);

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//Update----------------------------------------------------------------------------------------------------------------

    public boolean validateFields(roomAva_Model user) {
        // Validate if any field is empty
        return user.getPackage_Rate() != 0
                && //                user.getRoom_no()!=0 &&
                user.getRate() != 0
                && !user.getAvailability().isEmpty()
                && !user.getStatus().isEmpty();

    }

    public void updateStatus(int roomNumber, JComboBox<String> combo_Status) {
        roomNumber = view.getSelectedRoomNumber();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

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

//    public void updateRoomDetails(roomAva_Model model) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
//
//            // Update the room details in the database
//            String query = "UPDATE rooms SET room_status = ?, room_rate = ?, room_availability = ? WHERE roomNo = ?";
//            pst = conn.prepareStatement(query);
//            pst.setString(1, model.getStatus());
//            pst.setInt(2, model.getRate());
//            pst.setString(3, model.getAvailability());
//            pst.setInt(4, view.getSelectedRoomNumber());
//            pst.executeUpdate();
//
//            pst.close();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public boolean userRegister(roomAva_Model room) throws Exception {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
        Statement stmt = conn.createStatement();

        String query = "UPDATE rooms SET room_status = ?, room_rate = ?, package_rate = ?, room_availability = ? WHERE roomNo = ?";
        pst = conn.prepareStatement(query);
        pst.setString(1, room.getStatus());
        pst.setInt(2, room.getRate());
        pst.setString(4, room.getAvailability());
        pst.setInt(3, room.getPackage_Rate());
        pst.setInt(5, view.getSelectedRoomNumber());
        System.out.println("Data Updated");
        JOptionPane.showMessageDialog(null, "Updated successfully");
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            return true;
        } else {
            return false;
        }

    }

//   public void updateStatus(int roomNumber, JComboBox<String> combo_Status) {
//       roomNumber=view.getSelectedRoomNumber();
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
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
