
package DaO;
//saurab
import java.sql.*;
import database.FRONT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.sql.Date;
public class dao_checkOut{
    
    private Connection conn = database.FRONT.dbConnect();
    PreparedStatement pst;
    
        public List<Integer> refreshCID() {
        List<Integer> roomNumbers = new ArrayList<>();
        try {
            String query = "SELECT customerNO FROM checkIn_DB";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int roomNumber = rs.getInt("customerNO");
                roomNumbers.add(roomNumber);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println("Retrieved Room Numbers: " + roomNumbers);
        return roomNumbers;
    }

public Date getCheckinTime(int roomNumber) {
    Date checkinDate = null;

    try {
        String query = "SELECT checkin_time FROM checkIn_DB WHERE customerNO = ?";
        pst = conn.prepareStatement(query);
        pst.setInt(1, roomNumber);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Retrieve the checkin_time as a Date object
            checkinDate = rs.getDate("checkin_time");
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return checkinDate;
}
public int getRoomNO(int CID) {
    int room_numb = 0;

    try {
        String query = "SELECT room_no FROM checkIn_DB WHERE customerNO = ?";
        pst = conn.prepareStatement(query);
        pst.setInt(1, CID);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            room_numb = rs.getInt("room_no");
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return room_numb;
}
public int calculateTotalAmount(int CID) {
    int totalAmount = 0;

    try {
        String query = "SELECT amount_due, amount_paid FROM checkIn_DB WHERE customerNO = ?";
        pst = conn.prepareStatement(query);
        pst.setInt(1, CID);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int amountDue = rs.getInt("amount_due");
            int amountPaid = rs.getInt("amount_paid");

            totalAmount = amountDue + amountPaid;
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return totalAmount;
}
public boolean insertintoDB(int CID, int total, Date checkinDate, Date checkoutDate, int duration, int roomNumber) throws Exception {
    try {
        String getCustomerInfoQuery = "SELECT customer_name, phone_number, duration FROM checkIn_DB WHERE customerNO = ?";
        pst = conn.prepareStatement(getCustomerInfoQuery);
        pst.setInt(1, CID);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String fullName = rs.getString("customer_name");
            String phoneNumber = rs.getString("phone_number");
            int durationFromDB = rs.getInt("duration");

            // Use the duration from the database if the duration parameter is not provided
            if (duration <= 0) {
                duration = durationFromDB;
            }

            String insertQuery = "INSERT INTO ex_customer (full_name, phone_number, room_number, total, duration, checkin_date, checkout_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(insertQuery);
            pst.setString(1, fullName);
            pst.setString(2, phoneNumber);
            pst.setInt(3, roomNumber);
            pst.setInt(4, total);
            pst.setInt(5, duration);
            pst.setDate(6, checkinDate);
            pst.setDate(7, checkoutDate);

            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}

    public boolean deleteEntry(int CID) {
        try {
            String deleteQuery = "DELETE FROM checkIn_DB WHERE customerNO = ?";
            pst = conn.prepareStatement(deleteQuery);
            pst.setInt(1, CID);

            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

public boolean updateRoomStatus(int roomNumber) {
    try {
        String updateQuery = "UPDATE rooms SET room_availability = 'available' WHERE roomNo = ?";
        pst = conn.prepareStatement(updateQuery);
        pst.setInt(1, roomNumber);

        int rowsAffected = pst.executeUpdate();

        return rowsAffected > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}


}
