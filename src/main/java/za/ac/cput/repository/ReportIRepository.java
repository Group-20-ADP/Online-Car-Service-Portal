package za.ac.cput.repository;

/*Author
  Moegamad Nur Duncan 220014442
* ReportIRepository,java
* Date : 10 April 2022
*
*
* */

import za.ac.cput.Entity.Report;
import java.util.Set;

public interface ReportIRepository extends IRepository <Report, Integer> {

    public Set <Report> getAll();

}
