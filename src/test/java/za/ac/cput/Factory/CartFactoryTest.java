package za.ac.cput.Factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Cart;

import static org.junit.jupiter.api.Assertions.*;

public class CartFactoryTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test(){
        Cart cart = CartFactory.createCart("777", "214044750", "R5000", "4 March");
        assertNotNull(cart);
    }

}
