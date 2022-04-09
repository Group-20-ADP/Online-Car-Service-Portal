/**Entity for Vehicle Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
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
public class Vehicle {
    private int vehicleID;
    private String make, model, type, year;

    public Vehicle copy(){
        return this.toBuilder().build();
    }
}
