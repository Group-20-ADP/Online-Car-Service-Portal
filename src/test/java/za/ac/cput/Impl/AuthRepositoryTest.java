/**Entity : AuthenticationIRepository TEST
 Author: Manasseh Barnes (218009615)
 Milestone: TDD - first deliverable
 */
package za.ac.cput.Impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Authentication;
import za.ac.cput.Factory.AuthenticationFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AuthRepositoryTest {

    private static final AuthRepository authRepository = AuthRepository.getRepository();
    private static final Authentication auth = AuthenticationFactory.createAuthentication("", "MannyBonzo", "12345");

    @Test
    void a_create() {
        Authentication created = authRepository.create(auth);
        assertEquals(auth.getAuthID(), created.getAuthID());
        System.out.println("Created = " + created);
    }

    @Test
    void c_update() {
        Authentication updated = new Authentication.authBuilder().copy(auth)
                .password("Testing")
                .build();
        assertNotNull(AuthRepository.getRepository().update(updated));
        System.out.println("Updated = " + updated);
    }

    @Test
    void b_read() {
        Authentication read = authRepository.read(auth.getAuthID());
        assertNotNull(read);
        System.out.println("Read = " + read);
    }

    @Test
    void e_delete() {
        boolean success = authRepository.delete(auth.getAuthID());
        assertTrue(success);
        System.out.println("Deleted = " + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Get all = " + authRepository.getAll());
    }
}