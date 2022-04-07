/**Entity for Vehicle Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

public class Vehicle {
    private int vehicleID;
    private String make, model, type, year;

    private Vehicle(vehicleBuilder builder) {
        this.vehicleID = builder.vehicleID;
        this.make = builder.make;
        this.model = builder.model;
        this.type = builder.type;
        this.year = builder.year;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    static class vehicleBuilder {
        private int vehicleID;
        private String make, model, type, year;

        public vehicleBuilder setVehicleID(int vehicleID) {
            this.vehicleID = vehicleID;
            return this;
        }

        public vehicleBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public vehicleBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public vehicleBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public vehicleBuilder setYear(String year) {
            this.year = year;
            return this;
        }

        public vehicleBuilder copy(Vehicle vehicle)  {
            this.vehicleID = vehicle.vehicleID;
            this.make = vehicle.make;
            this.model = vehicle.model;
            this.type = vehicle.type;
            this.year = vehicle.year;
            return this;
        }

        public Vehicle build(){return new Vehicle(this);}
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleID=" + vehicleID +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
