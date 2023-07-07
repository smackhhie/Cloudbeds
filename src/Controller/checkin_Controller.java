package Controller;

import Model.checkin_Model;
import View.Check_in_out;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkin_Controller {
    private Connection conn;
    PreparedStatement pst;
    checkin_Model model;
    Check_in_out view;  
    private int updatedCustomerId = 100;

    public checkin_Controller(Check_in_out view) {
        this.view = view;
        view.addCheckin(new checkinListener());
        view.calcDue(new calcListener());
        updatedCustomerId = getLastCustomerIdFromDatabase() + 1;
        view.getTxt_cID().setText(String.valueOf(updatedCustomerId));

    }
class checkinListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            model = view.getData();
            if (checkcheckInData(model)) {
                updateRoomStatus(model.getRoomNumber());
                view.showMessage("Data successfully inserted");
                updatedCustomerId = getLastCustomerIdFromDatabase() + 1;
                view.getTxt_cID().setText(String.valueOf(updatedCustomerId));
                clearTextFields();
            } else {
                view.showMessage("Error while inserting data");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
     private void clearTextFields() {
        view.getTxt_name().setText("");
        view.getTxt_Phonenumber().setText("");
        view.getTxt_amtPaid().setText("");
        view.getTxt_Duration().setText("");
        view.getTxt_amtDue().setText("");
        
        view.getCombo_rNumber().setSelectedIndex(-1);
        view.getCombo_rType().setSelectedIndex(-1);
        view.getButtonGroupGender().clearSelection();
    }

    public boolean checkcheckInData(checkin_Model obj) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
        String sql = "INSERT INTO checkIn_DB (customer_name, phone_number, amount_paid, checkin_time, duration, gender, room_no, room_type, amount_due, customerNO,package) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, obj.getFullname());
        pst.setString(2, obj.getPhNumber());
        int amountPaid = obj.getAmountPaid();
        pst.setInt(3, amountPaid);
        java.sql.Date currentDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        pst.setDate(4, currentDate);
        pst.setInt(5, obj.getDuration());
        pst.setString(6, obj.getGender());
        pst.setInt(7, obj.getRoomNumber());
        pst.setString(8, obj.getRoomType());
        pst.setInt(9, obj.getAmountRemaining());
        pst.setInt(10, obj.getCustomerId());
        if (view.getpackageStatus().equals("Package")) {
            pst.setString(11, "Yes");
        } else {
        pst.setString(11, "No");
        }

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            return true;
        } else {
            return false;
        }
        
    }
    public void updateRoomStatus(int roomNumber) {
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
        String sql = "UPDATE rooms SET room_availability = 'occupied' WHERE roomNo = ?";
        pst = conn.prepareStatement(sql);
        pst.setInt(1, roomNumber);
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    private int getLastCustomerIdFromDatabase() {
    int lastCustomerId = 0;
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
        String query = "SELECT MAX(customerNO) FROM checkIn_DB";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        if (rs.next()) {
            lastCustomerId = rs.getInt(1);
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lastCustomerId;
}
        public int getRoomRate(int roomNumber) {
    int roomRate = 0;
   
    if (view.getpackageStatus().equals("Package")) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
            String query = "SELECT package_rate FROM rooms WHERE roomNo = ?";
            pst = conn.prepareStatement(query);
            pst.setInt(1, roomNumber);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                roomRate = rs.getInt("package_rate");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");
            String query = "SELECT room_rate FROM rooms WHERE roomNo = ?";
            pst = conn.prepareStatement(query);
            pst.setInt(1, roomNumber);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                roomRate = rs.getInt("room_rate");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    System.out.println(roomRate);
    return roomRate;
}



    public void refreshRoomNumbers(String roomType, JComboBox<String> combo_rNumber) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudbeds", "root", "15anup#$");

            // to retrieve available room numbers of the selected type
            String query = "SELECT roomNo FROM rooms WHERE room_type = '" + roomType
                    + "' AND room_status = 'clean' AND  room_availability = 'available'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            combo_rNumber.removeAllItems();

            // Populate the combo box with retrieved room numbers
            while (rs.next()) {
                int roomNumber = rs.getInt("roomNo");
                combo_rNumber.addItem(String.valueOf(roomNumber));
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public String getRoomType(int roomNumber) {
        String roomType = "";
        try {

            String query = "SELECT room_type FROM rooms WHERE roomNo = ?";
            pst = conn.prepareStatement(query);
            pst.setInt(1, roomNumber);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                roomType = rs.getString("room_type");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomType;
    }


    class calcListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                
                int amountDue = calculateAmountDue();
                view.getTxt_amtDue().setText(String.valueOf(amountDue));
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public int calculateAmountDue() {
        // Get the room number from the combo box
        int roomNumber = Integer.parseInt(view.getCombo_rNumber().getSelectedItem().toString());

        // Get the room rate for the selected room number
        int roomRate = getRoomRate(roomNumber);

        // Get the duration and amount paid from the view
        int duration = Integer.parseInt(view.getTxt_Duration().getText());
        int amountPaid = Integer.parseInt(view.getTxt_amtPaid().getText());

        // Calculate the amount due based on the duration and room rate
        int totalAmount = duration * roomRate;
        int amountDue = totalAmount - amountPaid;

        return amountDue;
    }
}