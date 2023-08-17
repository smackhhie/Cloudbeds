package controller;

import model.checkin_Model;
import view.Check_in;
import DaO.dao_All;
import javax.swing.JComboBox;
import java.util.List;

public class checkin_Controller {

    private checkin_Model mymodel;
    private Check_in view;
    private dao_All data;
    private int updatedCustomerId = 100;

    public checkin_Controller(Check_in view, checkin_Model mymodel, dao_All data) {
        this.view = view;
        this.mymodel = mymodel;
        this.data = data;
    }

    public checkin_Controller(Check_in view) {
        this.view = view;
        updatedCustomerId = lastCID() + 1;
        view.getTxt_cID().setText(String.valueOf(updatedCustomerId));

    }

    public void submit() {

        if (view.isvalid()) {
            mymodel = view.getData();
            data = new dao_All();
            try {
                data.checkcheckInData(
                        mymodel.getFullname(),
                        mymodel.getPhNumber(),
                        mymodel.getAmountPaid(),
                        mymodel.getCheckinDate(),
                        mymodel.getDuration(),
                        mymodel.getGender(),
                        mymodel.getRoomNumber(),
                        mymodel.getRoomType(),
                        mymodel.getAmountRemaining(),
                        mymodel.getCustomerId(),
                        mymodel.getPackage()
                );

                view.showMessage("Data successfully inserted");
            } catch (Exception e) {
                e.printStackTrace();
            }

            updateStatus();
            updatedCustomerId = lastCID() + 1;
            view.getTxt_cID().setText(String.valueOf(updatedCustomerId));

            view.clearTextFields();
        }
    }
    public void updateStatus() {
        data = new dao_All();
        data.updateRoomStatus(mymodel.getRoomNumber());
    }

    private int lastCID() {
        data = new dao_All();
        int LastCid = 0;
        try {
            LastCid = data.getLastCustomerIdFromDatabase();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return LastCid;
    }

    public int roomRate() {
        data = new dao_All();
        int rate = 0;
        try {
            rate = data.roomrate(
                    view.getCombo_rNumber(),
                    view.getpackageStatus()
            );
        } catch (Exception e) {

            e.printStackTrace();
        }
        return rate;
    }

    public void refreshRoomNumberss(String roomType, JComboBox<String> combo_rNumber) {

        data = new dao_All();
        List<Integer> roomNumbers = data.refreshRoomNumbers(view.selectedroomType());
        combo_rNumber.removeAllItems();

        // Populate the combo box with 
        for (int roomNumber : roomNumbers) {
            combo_rNumber.addItem(String.valueOf(roomNumber));
        }
    }

    public int calculateAmountDue() {
        int roomRate = roomRate();
        int duration = Integer.parseInt(view.getTxt_Duration().getText());
        int amountPaid = Integer.parseInt(view.getTxt_amtPaid().getText());
        int totalAmount = duration * roomRate;
        int amountDue = totalAmount - amountPaid;
        return amountDue;
    }

}
