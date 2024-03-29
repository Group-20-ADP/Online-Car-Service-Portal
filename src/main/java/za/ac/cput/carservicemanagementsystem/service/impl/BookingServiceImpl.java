package za.ac.cput.carservicemanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.carservicemanagementsystem.entity.Booking;
import za.ac.cput.carservicemanagementsystem.repository.BookingRepository;
import za.ac.cput.carservicemanagementsystem.service.BookingService;

import java.util.List;

/**Service implementation for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 */
@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository  repository;

    @Autowired
    public BookingServiceImpl(BookingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Booking create(Booking booking) { return repository.save(booking); }

    @Override
    public Booking update(Booking booking, Long key) { return null; }

    @Override
    public List<Booking> findAll() {
        return repository.findAll();
    }

    @Override
    public Booking findById(Long key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public void delete(Long id) { repository.deleteById(id); }
}
