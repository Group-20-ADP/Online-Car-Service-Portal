package za.ac.cput.Impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.Role;
import za.ac.cput.Factory.AdminFactory;
import za.ac.cput.Factory.RoleFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepositoryTest {

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
         Role role = RoleFactory.createRole(1,"Administrator");
         Admin admin = AdminFactory.createAdmin(2, role, "Kurtney",
                 "kurt17@gmail.com","as92^ds&&9");
         AdminRepository obj = AdminRepository.getRepository();

         obj.create(admin);
         //List<Admin> list = obj.getListAdmins();
         System.out.println(obj.read(2));
        // assertNotNull(list);
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