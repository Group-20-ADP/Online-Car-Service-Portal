/**Entity : BookingIRepository TEST
 Author: Manasseh Barnes (218009615)
 Milestone: TDD - first deliverable
 */
package za.ac.cput.Impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Booking;
import za.ac.cput.Factory.BookingFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingRepositoryTest {

    private static final BookingRepository bookingRepository = BookingRepository.getBookingRepository();
    private static final Booking booking = BookingFactory.createBooking("", "1", "1", "1", "1");

    @Test
    void a_create() {
        Booking created = bookingRepository.create(booking);
        assertEquals(booking.getBookingID(), created.getBookingID());
        System.out.println("Created: " + created);
    }

    @Test
    void c_update() {
        Booking updated = new Booking.bookingBuilder().copy(booking).bookingID("1")
                .build();
        assertNotNull(bookingRepository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void b_read() {
        Booking read = bookingRepository.read(booking.getBookingID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void e_delete() {
        boolean success = bookingRepository.delete(booking.getBookingID());
        assertTrue(success);
        System.out.println("Deleted: " + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Get All: " + bookingRepository.getAll());
    }
}