package za.ac.cput.Factory;

import za.ac.cput.Entity.*;

public class VehicleFactory {
    public static Vehicle createVehicle(int vehicleID, String make, String model, String type, String year) {
        return new Vehicle.vehicleBuilder()
                .setVehicleID(vehicleID)
                .setMake(make)
                .setModel(model)
                .setType(type)
                .setYear(year)
                .build();
    }
}
