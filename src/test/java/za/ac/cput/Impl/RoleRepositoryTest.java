/**
 Author: Kurtney Clyde Jantjies (218138105)
 */
package za.ac.cput.Impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.Role;
import za.ac.cput.Factory.AdminFactory;
import za.ac.cput.Factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

class RoleRepositoryTest {
    private static RoleRepository roleRepository = RoleRepository.getRepository();
    private static Role role = RoleFactory.createRole(1,"SuperVisor");

    @Test
    void getRepository() {
        RoleRepository roleRepo = roleRepository;
        assertNotNull(roleRepo);
    }

    @Test
    void create() {
        Role roleCreated = (Role) roleRepository.create(role);
        assertEquals(role.getRoleID(), roleCreated.getRoleID());
    }

    @Test
    void update() {
        roleRepository.create(role);
        Role updatedRole = new Role.RoleBuilder().copy(role)
                .setRoleName("Manager")
                .build();
        assertNotNull(roleRepository.update(updatedRole));
    }

    @Test
    void read() {
        Role role = roleRepository.read(1);
        assertNotNull(role);
    }

    @Test
    void delete() {
        boolean status = roleRepository.delete(role.getRoleID());
        assertTrue(status);
    }

    @Test
    void getAllRoles() {
        assertNotNull(roleRepository.getAllRoles());
    }
}