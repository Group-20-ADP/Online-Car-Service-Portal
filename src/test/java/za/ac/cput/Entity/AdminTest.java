/**Entity for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

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

    }
}