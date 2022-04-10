/**
  Author: Kurtney Clyde Jantjies (218138105)
  MileStone Date:
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    public void testBuilder(){
        Role roleID = new Role.RoleBuilder()
                .setRoleID(1)
                .setRoleName("SuperVisor").build();
        Admin admin = new Admin.AdminBuilder()
                .setRoleID(roleID)
                .setAdminID(1)
                .setAdminName("Joe")
                .setAdminEmail("Dedri")
                .setAdminPassword("a(8BCU(*#b9A")
                .build();
        System.out.println(admin);
        assertNotNull(admin);
    }

    @Test
    public void testFactory(){
        Role role = new Role.RoleBuilder()
                .setRoleID(1)
                .setRoleName("Supervisor").build();
        Admin admin = AdminFactory.createAdmin(1 ,role,"Kurtney", "kurtjan12@gmail.com","u&j*W9d2-)CJ");
        System.out.println(admin);
        assertNotNull(admin);
    }

    @Test
    public void testRepository(){

    }
}