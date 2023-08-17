
package model;

import java.sql.Date;
public class checkout_Model {

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    public checkout_Model( int roomNumber,Date checkoutDate, Date checkinDate, int customerId, int total) {

        this.total = total;
        this.roomNumber = roomNumber;
        this.checkinDate = checkinDate;
        this.customerId = customerId;
        this.checkoutDate = checkoutDate;
    }
    int customerId,roomNumber, total;
    Date checkinDate,checkoutDate;


    
}
