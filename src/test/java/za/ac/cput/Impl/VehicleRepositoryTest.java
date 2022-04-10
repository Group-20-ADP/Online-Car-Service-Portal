package za.ac.cput.Impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Vehicle;
import za.ac.cput.Factory.VehicleFactory;
import za.ac.cput.repository.VehicleIRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class VehicleRepositoryTest {

    private static VehicleRepository respository = VehicleRepository.getVehicleRepository();
    private static Vehicle vehicle = VehicleFactory.createVehicle("","BMW","X5","2018","Black");

    @Test
    void a_create() {
        Vehicle created = respository.create(vehicle);
        assertEquals(vehicle.getVehicleID(),created.getVehicleID());
        System.out.println("Created: "+created);
    }

    @Test
    void c_update() {
        Vehicle updated = new Vehicle.vehicleBuilder().copy(vehicle).setModel("M5")
                .build();
        assertNotNull(respository.update(updated));
        System.out.println("Updated: "+updated);
    }

    @Test
    void b_read() {
        Vehicle read = respository.read(vehicle.getVehicleID());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void e_delete() {
        boolean success = respository.delete(vehicle.getVehicleID());
        assertTrue(success);
        System.out.println("Deleted: "+ true);
    }

    @Test
    void d_getAll() {
        System.out.println("Get All: "+respository.getAll());
    }
}