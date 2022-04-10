package za.ac.cput.Impl;

/*Author
  Moegamad Nur Duncan 220014442
* Workshop Repository.java
* Date : 10 April 2022
*
*
* */

import za.ac.cput.Entity.Workshop;
import za.ac.cput.repository.WorkshopIRepository;

import java.util.Set;
import java.util.HashSet;

public class WorkshopRepository implements WorkshopIRepository {

    private static WorkshopRepository repository = null;
    private Set<Workshop> workshopData = null;

    private WorkshopRepository() {
        workshopData = new HashSet<Workshop>();
    }

    //Singleton
    public static WorkshopRepository getRepository() {

        if (repository == null) {
            repository = new WorkshopRepository();
        }

        return repository;
    }

    @Override
    public Workshop create(Workshop workshop) {
        boolean success = workshopData.add(workshop);

        if(!success) {
            return null;
        }

        else return workshop;
    }

    @Override
    public Workshop update(Workshop workshop) {

        Workshop diffWorkshop = read(workshop.getWorkshopID());

        if (diffWorkshop != null) {
            workshopData.remove(diffWorkshop);
            workshopData.add(workshop);
            return workshop;
        }

        else return null;
    }

    @Override
    public Workshop read(Integer workshopID) {
        for (Workshop work : workshopData) {
            if (work.getWorkshopID() == workshopID)
                return work;
        }

        return null;
    }

    @Override
    public boolean delete(Integer workshopID) {
        Workshop workshopDelete = read(workshopID);
        if (workshopDelete == null) {
            return false;
        }

        else workshopData.remove(workshopDelete);
        return true;
    }

    @Override
    public Set<Workshop> getAll() {
        return workshopData;

    }


}
