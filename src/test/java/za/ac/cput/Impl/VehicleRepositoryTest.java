/**Entity : VehicleIRepository TEST
 Author: Manasseh Barnes (218009615)
 Milestone: TDD - first deliverable
 */
package za.ac.cput.Impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Vehicle;
import za.ac.cput.Factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class VehicleRepositoryTest {

    private static final VehicleRepository VehicleRespository = VehicleRepository.getVehicleRepository();
    private static final Vehicle vehicle = VehicleFactory.createVehicle("","BMW","X5","2018","Black");

    @Test
    void a_create() {
        Vehicle created = VehicleRespository.create(vehicle);
        assertEquals(vehicle.getVehicleID(),created.getVehicleID());
        System.out.println("Created: "+created);
    }

    @Test
    void c_update() {
        Vehicle updated = new Vehicle.vehicleBuilder().copy(vehicle).setModel("M5")
                .build();
        assertNotNull(VehicleRespository.update(updated));
        System.out.println("Updated: "+updated);
    }

    @Test
    void b_read() {
        Vehicle read = VehicleRespository.read(vehicle.getVehicleID());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void e_delete() {
        boolean success = VehicleRespository.delete(vehicle.getVehicleID());
        assertTrue(success);
        System.out.println("Deleted: "+ true);
    }

    @Test
    void d_getAll() {
        System.out.println("Get All: "+VehicleRespository.getAll());
    }
}