package za.ac.cput.repository;

import za.ac.cput.Entity.Booking;

import java.util.Set;

public interface BookingIRepository extends IRepository<Booking, String> {
    public Set<Booking> getAll();
}
