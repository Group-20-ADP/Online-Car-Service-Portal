/**
 Author: Kurtney Jantjies (218138105)
 */
package za.ac.cput.carservicemanagementsystem.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle implements Serializable {
    @NotNull
    @Column(name = "vehicle_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long vehicleID;
    private String make, model, type, year;
    @JoinColumn(name = "custId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customerId;

}
