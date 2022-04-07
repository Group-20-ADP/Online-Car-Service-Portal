package za.ac.cput.Factory;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
        public void test(){
        Employee employee = EmployeeFactory.createEmployee("Manager", "214044750", "Jeff", "olliemo95@gmail.com", "12345");
        assertNotNull(employee);
    }
}