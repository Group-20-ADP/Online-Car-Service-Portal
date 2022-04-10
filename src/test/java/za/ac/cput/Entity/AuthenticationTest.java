/**Test for Authentication Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.AuthenticationFactory;
import za.ac.cput.Utilities.Helper;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationTest {
    //Test for Authentication class
    @Test
    public void testBuilder() {
        Authentication authentication = new Authentication.authBuilder()
                //Will Replace the default values once other classes are implemented
                .authID(Helper.generateID())
                .username("admin")
                .password("admin")
                .build();
        System.out.println(authentication);
        assertEquals("admin", authentication.getUsername());
        assertEquals("admin", authentication.getPassword());
    }

    @Test
    public void testFactory() {
        Authentication authentication = AuthenticationFactory.createAuthentication("", "admin", "admin");
        System.out.println(authentication);
        assertEquals(authentication, authentication);
    }
}