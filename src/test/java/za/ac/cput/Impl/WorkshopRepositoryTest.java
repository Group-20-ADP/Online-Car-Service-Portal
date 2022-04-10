package za.ac.cput.Impl;

/*Author
  Moegamad Nur Duncan 220014442
* Test for Workshop Repository
* Date : 10 April 2022
*
*
* */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import za.ac.cput.Entity.Workshop;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Factory.WorkshopFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)

class WorkshopRepositoryTest {

    public static WorkshopRepository repository = WorkshopRepository.getRepository();

    public static Workshop workshop = WorkshopFactory.createWorkshop(22, "Atlantis Motors", "Atlantis");

    @Test
    void w_create() {
        Workshop generate = repository.create(workshop);
        assertNotNull(generate);
        System.out.println("Create: " + generate);
    }

    @Test
    void w_read() {
        Workshop view = repository.read(workshop.getWorkshopID());
        assertNotNull(view);
        System.out.println("Read: " + view );
    }

    @Test
    void w_update() {
        Workshop change = new Workshop.WorkshopBuilder().copy(workshop).setWorkshopID(1).setWorkshopName("Crawford Motors").setWorkshopLocation("Crawford")
                .build();
        assertNotNull(change);
        System.out.println("Update to: " + change);
    }

    @Test
    void w_delete() {
        boolean success = repository.delete(workshop.getWorkshopID());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void w_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}