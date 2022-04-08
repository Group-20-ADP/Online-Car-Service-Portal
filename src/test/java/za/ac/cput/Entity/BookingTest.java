/**Test for Booking Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    //Test for booking class
    @Test
    public void test() {
        Booking booking = new Booking.bookingBuilder()
                //will Replace the default with the actual values once other classes are implemented
                .bookingID(1)
                .customerID(1)
                .serviceID(1)
                .vehicleID(1)
                .workshopID(1)
                .build();
        System.out.println(booking);
        assertEquals(1,booking.getBookingID());
    }
}