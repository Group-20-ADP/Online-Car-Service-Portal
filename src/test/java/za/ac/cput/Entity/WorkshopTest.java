package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*Author
  Moegamad Nur Duncan 220014442
* Builder Pattern Test for Workshop Entity
*
*
*
* */
class WorkshopTest {

    @Test
    public void test() {
        Workshop workshop = new Workshop.WorkshopBuilder()
                .setWorkshopID(12)
                .setWorkshopLocation("Athlone")
                .setWorkshopName("Caltex Motors")
                .build();

        System.out.println(workshop);
        assertEquals(workshop, workshop);
    }
}