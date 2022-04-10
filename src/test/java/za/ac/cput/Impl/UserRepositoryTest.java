package za.ac.cput.Impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.Role;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.AdminFactory;
import za.ac.cput.Factory.RoleFactory;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private static UserRepository userRepository = UserRepository.getRepository();
    private static Role role = RoleFactory.createRole(0,"SuperVisor");
    private static User user = UserFactory
            .createUser(1,role, "Kurtney" , "kuj@msk.com", "32dJ799(0");

    @Test
    void getRepository() {
        UserRepository userRepo = userRepository;
        assertNotNull(userRepository);
    }

    @Test
    void create() {
        User userCreated = (User) userRepository.create(user);
        assertEquals(user.getUserID(), userCreated.getUserID());
    }

    @Test
    void update() {
        userRepository.create(user);
        User updatedUser = new User.UserBuilder().copy(user)
                .setUserEmail("dsdsdwed22@ds.com")
                .build();
        System.out.println(updatedUser);
        assertNotNull(userRepository.update(updatedUser));
    }

    @Test
    void read() {
        User testUser = userRepository.read(1);
        assertNotNull(testUser);
    }

    @Test
    void delete() {
        boolean status = userRepository.delete(user.getUserID());
        assertTrue(status);
    }

    @Test
    void getAll() {
        assertNotNull(userRepository);
    }
}