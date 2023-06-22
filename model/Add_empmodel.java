/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Add_empmodel {
    String fname,select,Sal,Phone,Citizen;

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
    public Add_empmodel(String fname,String select,String Sal,String Phone,String Citizen){
        this.fname=fname;
        this.select=select;
        this.Sal=Sal;
        this.Phone=Phone;
        this.Citizen=Citizen;
    }
    
}
