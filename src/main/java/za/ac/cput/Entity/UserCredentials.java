package za.ac.cput.Entity;
import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class UserCredentials implements Serializable {
    private String name, lastName, email, password;
}
