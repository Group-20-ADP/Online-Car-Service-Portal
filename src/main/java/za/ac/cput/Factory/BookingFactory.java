package za.ac.cput.Factory;

import za.ac.cput.Entity.*;

public class BookingFactory {
    public static Booking createBooking(int bookingID, int vehicleID, int customerID, int serviceID, int workshopID) {
        return new Booking.bookingBuilder()
                .bookingID(bookingID)
                .vehicleID(vehicleID)
                .customerID(customerID)
                .serviceID(serviceID)
                .workshopID(workshopID)
                .build();
    }
}
