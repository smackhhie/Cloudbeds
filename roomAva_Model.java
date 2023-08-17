/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class roomAva_Model {

    String availability, status;
    int room_no, rate, package_rate;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRoom_no() {
        return room_no;
    }

    public void setRoom_no(int room_no) {
        this.room_no = room_no;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPackage_Rate() {
        return package_rate;
    }

    public void setPackage_Rate(int package_rate) {
        this.package_rate = package_rate;
    }
//---------------------------------------------------------------------------------------------------------------------
    public static boolean roomStatus(String var) {
        if (var.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean roomAva(String var) {
        if (var.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean roomType(String var) {
        if (var.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean roomnumbervalid(String var) {
        if (var.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean r_rateemp(String var) {
        if (var.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean p_rateemp(String var) {
        if (var.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean r_rateISzero(int var) {
        if (var == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean p_rateISzero(int var) {
        if (var == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean r_RateisNeg(int var) {
        if (var < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean p_RateisNeg(int var) {
        if (var < 0) {
            return false;
        } else {
            return true;
        }
    }
//---------------------------------------------------------------------------------------------------------------------
    public roomAva_Model(String availability, String status, int room_no, int rate, int package_rate) {
        this.availability = availability;
        this.status = status;
        this.room_no = room_no;
        this.rate = rate;
        this.package_rate = package_rate;
    }
}
