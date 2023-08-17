/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Addempmodel {
    String fname,selectedValue,select,Sal,Phone,Citizen,male,female,other;

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getSal() {
        return Sal;
    }

    public void setSal(String Sal) {
        this.Sal = Sal;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getCitizen() {
        return Citizen;
    }

    public void setCitizen(String Citizen) {
        this.Citizen = Citizen;
    }
    public Addempmodel(String fname, String select, String Sal, String Phone, String Citizen, String male, String female, String other, String selectedValue){
        this.fname=fname;
        this.select=select;
        this.Sal=Sal;
        this.Phone=Phone;
        this.Citizen=Citizen;
        this.selectedValue=selectedValue;
        this.male=male;
        this.female=female;
        this.other=other;
    }
    
}
