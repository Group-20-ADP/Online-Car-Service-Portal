package za.ac.cput.Impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Login;
import za.ac.cput.Factory.LoginFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class LoginRepositoryTest {
    private static LoginRepository repository = (LoginRepository) LoginRepository.getRepository();
    private static Login log = LoginFactory.createLog("Ahini","21256Athi");
    @Test
    void a_creat() {
        Login loged =  repository.creat(log);
        assertEquals(log.getUserName(),loged.getUserName());
        System.out.println("Login "+ loged);
    }

    @Test
    void b_read() {
        Login read = repository.read(log.getUserName());
        assertNotNull(read);
        System.out.println("read "+ read);
    }

    @Test
    void c_update() {
        Login updated = new Login.Builder().copy(log).setuserName("Atix")
                .setPassWord("235*nnddb")
                .builder();
        assertNotNull(repository.update(updated));
        System.out.println("Updated " +updated);
    }

    @Test
    void d_delete() {
        boolean deleted = repository.delete(log.getUserName());
        assertTrue(deleted);
    }

    @Test
    void e_getall() {
        System.out.println("show all ");
        System.out.println(repository.getall());
    }



}
