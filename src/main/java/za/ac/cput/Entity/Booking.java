/**Entity for Booking Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

public class Booking {
    private int bookingID;
    private int vehicleID;
    private int customerID;
    private int serviceID;
    private int workshopID;

    private Booking(bookingBuilder builder){
        this.bookingID = builder.bookingID;
        this.vehicleID = builder.vehicleID;
        this.customerID = builder.customerID;
        this.serviceID = builder.serviceID;
        this.workshopID = builder.workshopID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(int workshopID) {
        this.workshopID = workshopID;
    }

    static class bookingBuilder {
        private int bookingID;
        private int vehicleID;
        private int customerID;
        private int serviceID;
        private int workshopID;

        public bookingBuilder bookingID(int bookingID){
            this.bookingID = bookingID;
            return this;
        }
        public bookingBuilder vehicleID(int vehicleID){
            this.vehicleID = vehicleID;
            return this;
        }
        public bookingBuilder customerID(int customerID){
            this.customerID = customerID;
            return this;
        }
        public bookingBuilder serviceID(int serviceID){
            this.serviceID = serviceID;
            return this;
        }
        public bookingBuilder workshopID(int workshopID){
            this.workshopID = workshopID;
            return this;
        }

        public bookingBuilder copy(Booking booking){
            this.bookingID = booking.bookingID;
            this.vehicleID = booking.vehicleID;
            this.customerID = booking.customerID;
            this.serviceID = booking.serviceID;
            this.workshopID = booking.workshopID;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }
    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", vehicleID=" + vehicleID +
                ", customerID=" + customerID +
                ", serviceID=" + serviceID +
                ", workshopID=" + workshopID +
                '}';
    }
}
