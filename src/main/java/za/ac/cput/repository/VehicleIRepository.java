package za.ac.cput.repository;

import za.ac.cput.Entity.Vehicle;

import java.util.Set;

public interface VehicleIRepository extends IRepository<Vehicle, String> {
    public Set<Vehicle> getAll();
}
