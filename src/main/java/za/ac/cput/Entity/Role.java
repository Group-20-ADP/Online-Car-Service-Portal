/**Entity for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
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
public class Role {
    private int roleID;
    private String name;

    public Role copy(){
        return this.toBuilder().build();
    }
}
