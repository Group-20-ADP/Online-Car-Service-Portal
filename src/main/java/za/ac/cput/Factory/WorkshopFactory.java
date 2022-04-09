package za.ac.cput.Factory;
import za.ac.cput.Entity.*;

public class WorkshopFactory {

    public static Workshop createWorkshop(int workshopID, String workshopName, String workshopLocation) {

        return new Workshop.WorkshopBuilder()
                .setWorkshopID(workshopID)
                .setWorkshopName(workshopName)
                .setWorkshopLocation(workshopLocation)
                .build();
    }

}
