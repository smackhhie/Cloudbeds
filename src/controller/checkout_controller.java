/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DaO.dao_checkOut;
import model.checkout_Model;
import view.Check_Out;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.util.List;
import java.util.Set;
import java.text.SimpleDateFormat;

public class checkout_controller {

    checkout_Model mymodel;
    Check_Out view;
    dao_checkOut data;

    public checkout_controller(Check_Out view, dao_checkOut data, checkout_Model mymodel) {
        this.view = view;
        this.data = data;
        this.mymodel = mymodel;
    }

    public checkout_controller(Check_Out view) {
        this.view = view;

    }

public void PopulateIds(JComboBox<String> cid_combo) {
    data = new dao_checkOut();
    List<Integer> roomNumbers = data.refreshCID();

    String selectedCid = (String) cid_combo.getSelectedItem(); // Save the currently selected cid

    cid_combo.removeAllItems();

    boolean foundSelectedCid = false; // To check if the selected cid is found in the updated items
    for (int roomNumber : roomNumbers) {
        String cidString = String.valueOf(roomNumber);
        cid_combo.addItem(cidString);

        // Check if the previously selected cid is found in the updated items
        if (!foundSelectedCid && selectedCid != null && selectedCid.equals(cidString)) {
            foundSelectedCid = true;
        }
    }

    // Select the next cid if the previously selected cid is removed from the updated items
    if (!foundSelectedCid && cid_combo.getItemCount() > 0) {
        cid_combo.setSelectedIndex(0);
    }
}



    public void refreshcheckin(int roomNumber, JTextField txtcheckintime) {
        Date date = data.getCheckinTime(roomNumber);

        if (date != null) {
            // Format the Date object as a String using SimpleDateFormat
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = dateFormat.format(date);

            txtcheckintime.setText(dateString);
        } else {
            txtcheckintime.setText(""); // Set an empty string if the date is null or not found
        }
    }

    public void refreshRoomno(int CID, JTextField txtroomno) {
        int rates = data.getRoomNO(CID);

        txtroomno.setText(Integer.toString(rates));
    }

    public void refreshTotal(int CID, JTextField txttotal) {
        int rates = data.calculateTotalAmount(CID);

        txttotal.setText(Integer.toString(rates));
    }
public void insert() {
    mymodel = view.getData();
    data = new dao_checkOut();
    try {
        boolean inserted = data.insertintoDB(
            mymodel.getCustomerId(),
            mymodel.getTotal(),
            mymodel.getCheckinDate(),
            mymodel.getCheckoutDate(),
            0, 
            mymodel.getRoomNumber()
        );

        if (inserted) {
            System.out.println("Success");

        } else {
            System.out.println("Failed");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

        
}
public boolean deleteEntry(int CID) {
      mymodel = view.getData();
        data = new dao_checkOut();
        
        try {
            boolean deleted = data.deleteEntry(CID);

            if (deleted) {
                System.out.println("Deletion Successful");
            } else {
                System.out.println("Deletion Failed");
            }

            return deleted;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

}
public boolean setRoomAva(int roomNumber) {
    data = new dao_checkOut();
    try {
        boolean updated = data.updateRoomStatus(roomNumber);

        if (updated) {
            System.out.println("Room status set to 'available'");
        } else {
            System.out.println("Failed to update room status");
        }

        return updated;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }

}

}
