package za.ac.cput.carservicemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.carservicemanagementsystem.entity.Booking;
import za.ac.cput.carservicemanagementsystem.entity.Workshop;

/**Repository for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 */

@Repository
public interface BookingRepository extends JpaRepository<Booking,  Long> {
}
