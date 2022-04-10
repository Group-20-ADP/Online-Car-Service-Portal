/**Entity : VehicleFactory
 Author: Manasseh Barnes (218009615)
 Milestone: Factory Implementation - first deliverable
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.*;
import za.ac.cput.Utilities.Helper;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleID, String make, String model, String type, String year) {

        String setVehicleID = Helper.generateID();
        return new Vehicle.vehicleBuilder()
                .setVehicleID(setVehicleID)
                .setMake(make)
                .setModel(model)
                .setType(type)
                .setYear(year)
                .build();
    }
}
