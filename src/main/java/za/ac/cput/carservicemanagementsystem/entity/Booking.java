/**Entity for Booking Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

public class Booking {
    private static String bookingID;
    private String vehicleID;
    private String customerID;
    private String serviceID;
    private String workshopID;

    public Booking(bookingBuilder builder){
        this.bookingID = builder.bookingID;
        this.vehicleID = builder.vehicleID;
        this.customerID = builder.customerID;
        this.serviceID = builder.serviceID;
        this.workshopID = builder.workshopID;
    }

    public static String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(String workshopID) {
        this.workshopID = workshopID;
    }

    public static class bookingBuilder {
        private String bookingID;
        private String vehicleID;
        private String customerID;
        private String serviceID;
        private String workshopID;

        public bookingBuilder bookingID(String bookingID){
            this.bookingID = bookingID;
            return this;
        }
        public bookingBuilder vehicleID(String vehicleID){
            this.vehicleID = vehicleID;
            return this;
        }
        public bookingBuilder customerID(String customerID){
            this.customerID = customerID;
            return this;
        }
        public bookingBuilder serviceID(String serviceID){
            this.serviceID = serviceID;
            return this;
        }
        public bookingBuilder workshopID(String workshopID){
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
