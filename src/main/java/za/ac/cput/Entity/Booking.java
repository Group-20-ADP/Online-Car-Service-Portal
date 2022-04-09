package za.ac.cput.Entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder=true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
public class Booking {
    private int bookingID;
    private int vehicleID;
    private int customerID;
    private int serviceID;
    private int workshopID;

    public Booking copy(){
        return this.toBuilder().build();
    }
}
