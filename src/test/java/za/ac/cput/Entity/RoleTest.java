/**
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date:
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.AdminFactory;
import za.ac.cput.Factory.RoleFactory;

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
        Role role = new Role.RoleBuilder()
                .setRoleID(1)
                .setRoleName("Supervisor").build();
        Role adminRole = RoleFactory.createRole(role.getRoleID(), role.getName());
        System.out.println(adminRole);
        assertNotNull(adminRole);
    }

    @Test
    public void testRepository(){

    }
}