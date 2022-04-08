package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkshopTest {

    @Test
    public void test() {
        Workshop workshop = Workshop.builder()
            .workshopID(12)
            .workshopLocation("Athlone")
            .workshopName("Caltex Motors")
            .build();
        System.out.println(workshop);
        assertEquals(workshop, workshop);
    }
}