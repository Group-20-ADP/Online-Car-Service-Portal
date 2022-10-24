package za.ac.cput.carservicemanagementsystem.repository;

/*Author
  Moegamad Nur Duncan 220014442
*
*
* */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.carservicemanagementsystem.entity.Workshop;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop,  Long> {
}