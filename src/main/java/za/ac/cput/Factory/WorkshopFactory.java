package za.ac.cput.Factory;
import za.ac.cput.Entity.*;

/*Author
  Moegamad Nur Duncan 220014442
* Factory Pattern for Workshop Entity
* Date : 09 April 2022
*
*
* */

public class WorkshopFactory {

    public static Workshop createWorkshop(int workshopID, String workshopName, String workshopLocation) {

        return new Workshop.WorkshopBuilder()
                .setWorkshopID(workshopID)
                .setWorkshopName(workshopName)
                .setWorkshopLocation(workshopLocation)
                .build();
    }

}
