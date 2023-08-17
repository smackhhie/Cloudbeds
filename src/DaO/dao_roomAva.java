//anup
package DaO;

import database.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public class dao_roomAva {

    private Connection conn = database.FRONT.dbConnect();
    PreparedStatement pst;
    
//public Set<String> getRoomsData() {
//    Set<String> stringSet = new LinkedHashSet<>();
//
//    try (Statement stmt = conn.createStatement();
//         ResultSet rs = stmt.executeQuery("SELECT roomNo, room_type, room_availability, room_status, package_rate, room_rate FROM rooms")) {
//
//        while (rs.next()) {
//            String roomNo = rs.getString("roomNo");
//            String roomType = rs.getString("room_type");
//            
//            String availability = rs.getString("room_availability");
//            String roomRate = rs.getString("room_rate");
//            String status = rs.getString("room_status");
//            String packageRate = rs.getString("package_rate");
//            
//
//            String roomData = roomNo + "," + roomType + "," + availability + "," + status + "," + packageRate + "," + roomRate;
//            stringSet.add(roomData);
//        }
//    } catch (SQLException e) {
//        System.out.println(e.getMessage());
//    }
//
//    return stringSet;
//}
public Set<String> getRoomsData() {
    Set<String> stringSet = new LinkedHashSet<>();

    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT roomNo, room_type, room_rate, room_availability, room_status, package_rate FROM rooms")) {

        while (rs.next()) {
            String roomNo = rs.getString("roomNo");
            String roomType = rs.getString("room_type");
            String roomRate = rs.getString("room_rate"); // Corrected column
            String availability = rs.getString("room_availability"); // Corrected column
            String status = rs.getString("room_status"); // Corrected column
            String packageRate = rs.getString("package_rate"); // Corrected column


            String roomData = roomNo + "," + roomType + "," + availability + "," + status + "," + packageRate + "," + roomRate;
            stringSet.add(roomData);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    return stringSet;
}


    public List<Integer> refreshRoomNumbers() {
        List<Integer> roomNumbers = new ArrayList<>();
        try {
            String query = "SELECT roomNo FROM rooms";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int roomNumber = rs.getInt("roomNo");
                roomNumbers.add(roomNumber);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomNumbers;
    }

    public String getRoomRates(int roomNumber) {
        StringBuilder rates = new StringBuilder();

        try {
            String query = "SELECT room_rate FROM rooms WHERE roomNo = ?";
            pst = conn.prepareStatement(query);
            pst.setInt(1, roomNumber);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int roomRate = rs.getInt("room_rate");
                rates.append(roomRate).append(", ");
            }

            if (rates.length() > 2) {
                rates.setLength(rates.length() - 2);
            }

            rs.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rates.toString();
    }

    public String getPackageRates(int roomNumber) {
        StringBuilder Prates = new StringBuilder();

        try {
            String query = "SELECT package_rate  FROM rooms WHERE roomNo = ?";
            pst = conn.prepareStatement(query);
            pst.setInt(1, roomNumber);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int packageRate = rs.getInt("package_rate");
                Prates.append(packageRate).append(", ");
            }

            if (Prates.length() > 2) {
                Prates.setLength(Prates.length() - 2);
            }

            rs.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Prates.toString();
    }

    public String getRoomStatus(int roomNumber) throws SQLException {
        String query = "SELECT room_status FROM rooms WHERE roomNo = ?";
        pst = conn.prepareStatement(query);
        pst.setInt(1, roomNumber);
        ResultSet rs = pst.executeQuery();

        String roomStatus = null;

        if (rs.next()) {
            roomStatus = rs.getString("room_status");
        }

        rs.close();
        pst.close();

        if (roomStatus == null) {
            throw new SQLException("Room status not found for room number: " + roomNumber);
        }

        return roomStatus;
    }
     public String getAvaiStatus(int roomNumber) throws SQLException {
        String query = "SELECT room_availability FROM rooms WHERE roomNo = ?";
        pst = conn.prepareStatement(query);
        pst.setInt(1, roomNumber);
        ResultSet rs = pst.executeQuery();

        String roomAvaStatus = null;

        if (rs.next()) {
            roomAvaStatus = rs.getString("room_availability");
        }

        rs.close();
        pst.close();

        if (roomAvaStatus == null) {
            throw new SQLException("Room status not found for room number: " + roomNumber);
        }

        return roomAvaStatus;
    }

    public boolean userRegister(String roomStat, int room_rate, int package_room, String room_ava, int roomNo) throws Exception {

        Statement stmt = conn.createStatement();

        String query = "UPDATE rooms SET room_status = ?, room_rate = ?, package_rate = ?, room_availability = ? WHERE roomNo = ?";
        pst = conn.prepareStatement(query);
        pst.setString(1, roomStat);
        pst.setInt(2, room_rate);
        pst.setString(4, room_ava);
        pst.setInt(3, package_room);
        pst.setInt(5, roomNo);
        System.out.println("Data Updated");
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            return true;
        } else {
            return false;
        }

    }
}
