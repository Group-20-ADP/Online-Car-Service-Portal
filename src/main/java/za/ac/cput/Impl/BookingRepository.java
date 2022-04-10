package za.ac.cput.Impl;

import za.ac.cput.Entity.Booking;
import za.ac.cput.repository.BookingIRepository;

import java.util.HashSet;
import java.util.Set;

public class BookingRepository implements BookingIRepository {
    private static BookingRepository bookingRepository = null;
    private Set<Booking> bookingDB;

    private BookingRepository(){bookingDB = new HashSet<Booking>();}

    public static BookingRepository getBookingRepository(){
        if (bookingRepository == null) bookingRepository = new BookingRepository();
        return bookingRepository;
    }

    @Override
    public Booking create(Booking booking) {
        boolean success = bookingDB.add(booking);
        if (!success) return null;
        return booking;
    }

    @Override
    public Booking update(Booking booking) {
        Booking updateBooking = read(Booking.getBookingID());
        if (updateBooking != null){
            bookingDB.remove(updateBooking);
            bookingDB.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public Booking read(String bookingID) {
        return bookingDB.stream()
                .filter(booking -> booking.getBookingID() == bookingID)
                .findAny()
                .orElse(null);
    }

    @Override
    public boolean delete(String bookingID) {
        Booking delete_booking = (Booking) read(bookingID);
        if (bookingID == null)
            return false;

        bookingDB.remove(delete_booking);
        return true;
    }

    @Override
    public Set<Booking> getAll() {
        return bookingDB;
    }
}
