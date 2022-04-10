package za.ac.cput.Impl;

import za.ac.cput.Entity.Vehicle;
import za.ac.cput.repository.VehicleIRepository;

import java.util.HashSet;
import java.util.Set;

public class VehicleRepository implements VehicleIRepository {
    private static VehicleRepository vehicleRepository = null;
    private final Set<Vehicle> vehicleDB;

    private VehicleRepository() {
        vehicleDB = new HashSet<Vehicle>();
    }

    public static VehicleRepository getVehicleRepository() {
        if (vehicleRepository == null) vehicleRepository = new VehicleRepository();
        return vehicleRepository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        boolean success = vehicleDB.add(vehicle);
        if(!success) return null;
        return vehicle;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle update_vehicle = read(vehicle.getVehicleID());
        if (update_vehicle != null) {
            vehicleDB.remove(update_vehicle);
            vehicleDB.add(vehicle);
            return vehicle;
        }
        return null;
    }

    @Override
    public Vehicle read(String vehicleID) {
        return vehicleDB.stream()
                .filter(vehicle -> vehicle.getVehicleID() == vehicleID)
                .findAny()
                .orElse(null);
    }

    @Override
    public boolean delete(String vehicleID) {
        Vehicle delete_vehicle = (Vehicle) read(vehicleID);
        if (vehicleID == null)
            return false;

        vehicleDB.remove(delete_vehicle);
        return true;
    }

    @Override
    public Set<Vehicle> getAll() {
        return vehicleDB;
    }
}
//End of File
