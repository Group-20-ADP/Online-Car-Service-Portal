/**Test for Authentication Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.AuthenticationFactory;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationTest {
    //Test for Authentication class
    @Test
    public void testBuilder() {
        Authentication authentication = new Authentication.authBuilder()
                //Will Replace the default values once other classes are implemented
                .username("admin")
                .password("admin")
                .build();
        System.out.println(authentication);
        assertEquals("admin", authentication.getUsername());
        assertEquals("admin", authentication.getPassword());
    }

    @Test
    public void testFactory() {
        Authentication authentication = AuthenticationFactory.createAuthentication(2, "admin", "admin");
        System.out.println(authentication);
        assertEquals("admin", authentication.getUsername());
    }
}