/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Add_roommodel {
    String rnumber,available,clean,price,bedtype,packagerate;

    public String getPackagerate() {
        return packagerate;
    }

    public void setPackagerate(String packagerate) {
        this.packagerate = packagerate;
    }

    public String getRnumber() {
        return rnumber;
    }

    public void setRnumber(String rnumber) {
        this.rnumber = rnumber;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }
        public Add_roommodel(String rnumber, String available, String clean, String price, String bedtype, String packagerate){
        this.rnumber=rnumber;
        this.available=available;
        this.clean=clean;
        this.price=price;
        this.bedtype=bedtype;
        this.packagerate=packagerate;
    }
}
