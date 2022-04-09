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
    }

    @Test
    void getListAdmins() {
    }

    @Test
    void getSetAdmins() {
    }

    @Test
    void create() {
         //Admin adminCreated = adminRepository.create((Object) admin);


    }

    @Test
    void update() {
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }
}