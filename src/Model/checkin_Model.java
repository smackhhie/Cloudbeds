/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Date;

public class checkin_Model {
    String fullname, phNumber, gender, roomType, room_package;
    int amountPaid, duration, roomNumber, customerId, amountRemaining;
    Date checkinDate;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        if (isValidPhoneNumber(phNumber)) {
            this.phNumber = phNumber;
        } else {
        throw new IllegalArgumentException("Invalid phone number format");
        }
    }
        public String getPackage() {
        return room_package;
    }

    public void setPackage(String room_package) {
        this.room_package = room_package;
    }
    private boolean isValidPhoneNumber(String phNumber) {
    // Validate phone number format (10 digits and integers only)
    return phNumber.matches("\\d{10}");
    }
        public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }
        public int getRoomNumber() {
        return roomNumber ;
    }

    public void setRoomNo(int roomNumber) {
        this.roomNumber = roomNumber;
    }
        public int getDuration() {
        return duration;        
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }
    public checkin_Model(String fullName,String room_package, String phoneNumber, int amountPaid, int duration, String gender, String roomType, int roomNumber, Date checkinDate, int customerId, int amountRemaining) {
    this.room_package=room_package;
    this.fullname = fullName;
    this.phNumber = phoneNumber;
    this.amountPaid = amountPaid;
    this.duration = duration;
    this.gender = gender;
    this.roomType = roomType;
    this.roomNumber = roomNumber;
    this.checkinDate = checkinDate;
    this.customerId = customerId;
    this.amountRemaining = amountRemaining;
}


}
