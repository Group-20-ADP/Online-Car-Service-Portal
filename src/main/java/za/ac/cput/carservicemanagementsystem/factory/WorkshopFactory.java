package za.ac.cput.carservicemanagementsystem.factory;
/*Author
  Moegamad Nur Duncan 220014442
*
*
* */

import za.ac.cput.carservicemanagementsystem.entity.Workshop;
import za.ac.cput.carservicemanagementsystem.util.Helper;

public class WorkshopFactory {

    public static Workshop createWorkshop(String name, String location) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(location, "Location");

        return Workshop.builder()
                .name(name)
                .location(location)
                .build();
    }
}