/**Tests for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void test() {
        User user = User.builder()
            .userID(1)
            .userEmail("218138105@mycput.ac.za")
            .userName("Kurtney")
            .build();
        assertEquals(user,user);
    }
}