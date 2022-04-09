/**Test for Vehicle Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void test() {
        Vehicle vehicle = Vehicle.builder()
            .vehicleID(2)
            .make("Opel")
            .model("Corsa")
            .type("Hatchback")
            .year("2008")
            .build();
        System.out.println(vehicle);
        assertEquals(vehicle, vehicle);
    }

}