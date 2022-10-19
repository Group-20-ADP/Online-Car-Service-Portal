/**
 Author: Kurtney Jantjies (218138105)
 */
package za.ac.cput.carservicemanagementsystem.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Role {
    private String roleName, description;
}
