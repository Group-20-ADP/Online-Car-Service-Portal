package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Test
    public void test() {
        Role roleCustomer = new Role.RoleBuilder()
                .setRoleID(1)
                .setRoleName("Customer")
                .build();
        System.out.println(roleCustomer);
    }
}