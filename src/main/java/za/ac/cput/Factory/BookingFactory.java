package za.ac.cput.Factory;

import za.ac.cput.Entity.*;
import za.ac.cput.Utilities.Helper;

public class BookingFactory {
    public static Booking createBooking(String bookingID, String vehicleID, String customerID, String serviceID, String workshopID) {

        String setBookingID = Helper.generateID();
        return new Booking.bookingBuilder()
                .bookingID(setBookingID)
                .vehicleID(vehicleID)
                .customerID(customerID)
                .serviceID(serviceID)
                .workshopID(workshopID)
                .build();
    }
}
