package za.ac.cput.carservicemanagementsystem.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**Entity for BookingRepository Entity
 Author: Manasseh Barnes (218009615)
 */
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking implements Serializable {
    @Column(name = "booking_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long bookingID;
    private Date date;
    private String duration;
    @JoinColumn(name = "custId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer  customerId;
    @JoinColumn(name = "vehicleID")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Vehicle> vehicleID;

}
