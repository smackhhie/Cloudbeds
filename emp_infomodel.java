/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rujan
 */
public class emp_infomodel {


    String fname,selectedValue,select,Sal,Phone,Citizen,male,female,other;

    public String getFname() {
        return fname;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public String getSelect() {
        return select;
    }

    public String getSal() {
        return Sal;
    }

    public String getPhone() {
        return Phone;
    }

    public String getCitizen() {
        return Citizen;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }

    public String getOther() {
        return other;
    }
        public emp_infomodel (String fname, String select, String Sal, String Phone, String Citizen, String male, String female, String other, String selectedValue){
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
