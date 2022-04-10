package za.ac.cput.repository;

/*Author
  Moegamad Nur Duncan 220014442
* WorkshopIRepository.java
* Date : 10 April 2022
*
*
* */

import za.ac.cput.Entity.Workshop;
import java.util.Set;


public interface WorkshopIRepository extends IRepository <Workshop, Integer> {

    public Set <Workshop> getAll();

}

