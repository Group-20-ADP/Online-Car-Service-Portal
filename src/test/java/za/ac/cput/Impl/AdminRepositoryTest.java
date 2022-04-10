package za.ac.cput.Impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.Role;
import za.ac.cput.Factory.AdminFactory;
import za.ac.cput.Factory.RoleFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepositoryTest {
    private static AdminRepository adminRepository = AdminRepository.getRepository();
    private static Role role = RoleFactory.createRole(1,"SuperVisor");
    private static Admin admin = AdminFactory.createAdmin(1,role, "Kurtney" , "kuj@msk.com", "32dJ799(0");

    @Test
    void getRepository() {
        AdminRepository adminRepo = adminRepository;
        assertNotNull(adminRepo);
    }

    @Test
    void getSetAdmins() {
        System.out.println(adminRepository.getSetAdmins());
        assertNotNull(adminRepository.getSetAdmins());
    }

    @Test
    void create() {
        Admin adminCreated = (Admin) adminRepository.create(admin);
        assertEquals(admin.getAdminID(), adminCreated.getAdminID());
    }

    @Test
    void update() {
        adminRepository.create(admin);
        Admin updatesAdmin = new Admin.AdminBuilder().copy(admin)
                .setAdminEmail("ds2@ds.com")
                .build();
        assertNotNull(adminRepository.update(updatesAdmin));
    }

    @Test
    void read() {
        Admin admin = adminRepository.read(1);
        assertNotNull(admin);
    }

    @Test
    void delete() {
        boolean status = adminRepository.delete(admin.getAdminID());
        assertTrue(status);
    }
}