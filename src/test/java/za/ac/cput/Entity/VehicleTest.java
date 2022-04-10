/**Test for Vehicle Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.VehicleFactory;
import za.ac.cput.Utilities.Helper;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testBuilder() {
        Vehicle vehicle = new Vehicle.vehicleBuilder()
                .setVehicleID(Helper.generateID())
                .setMake("Opel")
                .setModel("Corsa")
                .setType("Hatchback")
                .setYear("2008")
                .build();
        System.out.println(vehicle);
        assertEquals(vehicle, vehicle);
    }

    @Test
    public void testFactory() {
        Vehicle vehicle = VehicleFactory.createVehicle("", "Opel", "Corsa", "Hatchback", "2008");
        System.out.println(vehicle);
        assertEquals(vehicle, vehicle);
    }

}