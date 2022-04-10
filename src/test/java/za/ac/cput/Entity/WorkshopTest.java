package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.WorkshopFactory;

import static org.junit.jupiter.api.Assertions.*;

/*Author
  Moegamad Nur Duncan 220014442
* Builder Pattern Test for Workshop Entity
*
*
*
* */
//Builder Test
class WorkshopTest {

    @Test
    public void testBuilder() {
        Workshop workshop = new Workshop.WorkshopBuilder()
                .setWorkshopID(12)
                .setWorkshopLocation("Athlone")
                .setWorkshopName("Caltex Motors")
                .build();

        System.out.println(workshop);
        assertEquals(workshop, workshop);
    }

    //Factory Test
@Test
    public void testFactory() {

        Workshop workshop  = WorkshopFactory.createWorkshop(25, "Crawford Motors", "Crawford");
        System.out.println(workshop);
        assertNotNull(workshop);


    }
}