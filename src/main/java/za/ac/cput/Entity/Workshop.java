package za.ac.cput.Entity;

public class Workshop {

    private int workshopID;
    private String workshopName;
    private String workshopLocation;

    private Workshop (WorkshopBuilder builder) {
        this.workshopID = builder.workshopID;
        this.workshopName = builder.workshopName;
        this.workshopLocation = builder.workshopLocation;
    }

    public int getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(int workshopID) {
        this.workshopID = workshopID;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getWorkshopLocation() {
        return workshopLocation;
    }

    public void setWorkshopLocation(String workshopLocation) {
        this.workshopLocation = workshopLocation;
    }

    static class WorkshopBuilder {
        private int workshopID;
        private String workshopName;
        private String workshopLocation;

        public WorkshopBuilder setWorkshopID(int workshopID) {
            this.workshopID = workshopID;
            return this;
        }

        public WorkshopBuilder setWorkshopName(String workshopName) {
            this.workshopName = workshopName;
            return this;
        }

        public WorkshopBuilder setWorkshopLocation(String workshopLocation) {
            this.workshopLocation = workshopLocation;
            return this;
        }

        public WorkshopBuilder copy (Workshop workshop) {
            this.workshopID = workshop.workshopID;
            this.workshopName = workshop.workshopName;
            this.workshopLocation = workshop.workshopLocation;
            return this;
        }

        public Workshop build() {
            return new Workshop(this);
        }

    }

    @Override
    public String toString() {
        return "Workshop{" +
                "workshopID=" + workshopID +
                ", workshopName='" + workshopName + '\'' +
                ", workshopLocation='" + workshopLocation + '\'' +
                '}';
    }
}
