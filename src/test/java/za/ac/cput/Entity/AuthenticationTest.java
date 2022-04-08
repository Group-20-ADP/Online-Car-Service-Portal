/**Test for Authentication Entity
 Author: Manasseh Barnes (218009615)
 Milestone: Builder Pattern Implementation - first deliverable
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationTest {
    //Test for Authentication class
    @Test
    public void test() {
        Authentication authentication = Authentication.builder()
                .username("admin")
                .password("admin")
                .build();
        System.out.println(authentication);
        assertEquals("admin", authentication.getUsername());
        assertEquals("admin", authentication.getPassword());
    }
}