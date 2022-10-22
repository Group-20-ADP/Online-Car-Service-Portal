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
public class Customer implements Serializable {
    @NotNull
    @Column(name = "customer_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long custId;
    @Embedded
    private UserCredentials userCredentials;
}
