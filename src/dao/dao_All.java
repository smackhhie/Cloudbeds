package dao;
import database.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class dao_All {

    private Connection conn = FRONT.dbConnect();
    PreparedStatement pst;

    public boolean checkcheckInData(String fullName, String phoneNumber, 
            int amountPaid, Date checkinDate, int duration, String gender, int roomNumber, String roomType, 
            int amountRemaining, int customerId, String packageStatus) throws Exception {
        try {

            String sql = "INSERT INTO checkIn_DB (customer_name, "
                    + "phone_number, amount_paid, checkin_time, duration, gender, "
                    + "room_no, room_type, amount_due, customerNO, package) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, fullName);
            pst.setString(2, phoneNumber);
            pst.setInt(3, amountPaid);
            pst.setDate(4, checkinDate);
            pst.setInt(5, duration);
            pst.setString(6, gender);
            pst.setInt(7, roomNumber);
            pst.setString(8, roomType);
            pst.setInt(9, amountRemaining);
            pst.setInt(10, customerId);
            pst.setString(11, packageStatus);

            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {

            ex.printStackTrace();
            return false;
        }
    }

    public int roomrate(int roomNumber, String Package) {
        int roomRate = 0;
        if (Package.equals("Package")) {
            try {
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

    public void updateRoomStatus(int roomNumber) {
        try {
            String sql = "UPDATE rooms SET room_availability = 'occupied' WHERE roomNo = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, roomNumber);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> refreshRoomNumbers(String roomType) {
        List<Integer> roomNumbers = new ArrayList<>();
        try {

            String query = "SELECT roomNo FROM rooms WHERE room_type = '" + roomType
                    + "' AND room_status = 'clean' AND room_availability = 'available'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Retrieve room numbers and add them to the list
            while (rs.next()) {
                int roomNumber = rs.getInt("roomNo");
                roomNumbers.add(roomNumber);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomNumbers;
    }
        public int getLastCustomerIdFromDatabase() {
        int lastCustomerId = 0;
        try {
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

}
