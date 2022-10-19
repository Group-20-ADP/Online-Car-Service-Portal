/**
 Author: Kurtney Jantjies (218138105)
 */
package za.ac.cput.carservicemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.carservicemanagementsystem.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,  Long> {
}
