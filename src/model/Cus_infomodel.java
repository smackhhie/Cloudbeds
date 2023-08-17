/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rujan
 */
public class Cus_infomodel {

    String Cname,selectedValue,Citizen,Phone,male,female,other;



    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    public String getCitizen() {
        return Citizen;
    }

    public void setCitizen(String Citizen) {
        this.Citizen = Citizen;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
        public Cus_infomodel(String Cname, String Citizen, String Phone, String male, String female, String other, String selectedValue) {
            this.Cname=Cname;
            this.selectedValue=selectedValue;
            this.Citizen=Citizen;
            this.Phone=Phone;
            this.male=male;
            this.other=other;
    }
}
