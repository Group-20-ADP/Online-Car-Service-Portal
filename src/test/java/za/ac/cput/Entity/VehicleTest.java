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
        Vehicle vehicle = new Vehicle.vehicleBuilder()
                .setVehicleID(2)
                .setMake("Opel")
                .setModel("Corsa")
                .setType("Hatchback")
                .setYear("2008")
                .build();
        System.out.println(vehicle);
        assertEquals(vehicle, vehicle);
    }

}