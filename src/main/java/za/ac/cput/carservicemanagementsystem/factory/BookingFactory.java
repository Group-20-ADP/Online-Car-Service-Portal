package za.ac.cput.carservicemanagementsystem.factory;

import za.ac.cput.carservicemanagementsystem.entity.Booking;
import za.ac.cput.carservicemanagementsystem.util.Helper;

import java.util.Date;

/**Factory for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 */

public class BookingFactory {
    public static Booking createBooking( String name, String location) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(location, "Location");

        return Booking.builder()
                .date(new Date())

                .build();
    }
}
