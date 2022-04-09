/**
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date:
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Test
    public void testBuilder() {
        Role roleCustomer = new Role.RoleBuilder()
                .setRoleID(1)
                .setRoleName("Customer")
                .build();
        System.out.println(roleCustomer);
    }

    @Test
    public void testFactory(){

    }

    @Test
    public void testRepository(){

    }
}