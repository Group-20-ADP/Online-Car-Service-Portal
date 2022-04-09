/**Tests for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.UserFactory;
import za.ac.cput.Entity.Role;
import za.ac.cput.Utilities.Helper;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testBuilder() {
        User user = new User.UserBuilder()
                .setUserID(1)
                .setUserEmail("218138105@mycput.ac.za")
                .setUserName("Kurtney")
                .build();
        assertEquals(user,user);
    }

    @Test
    public void testFactory(){
        Role role = new Role.RoleBuilder()
                .setRoleID(0)
                .setRoleName("User").build();
        User user = UserFactory.createUser(1 ,role,"Kurtney", "kurtjan12@gmail.com","u&j*W9d2-)CJ");
        System.out.println(user);
        assertNotNull(user);
    }
}