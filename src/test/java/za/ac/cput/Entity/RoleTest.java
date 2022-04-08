package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Test
    public void test() {
        Role roleCustomer = Role.builder()
            .roleID(1)
            .name("Customer")
            .build();
        System.out.println(roleCustomer);
    }
}