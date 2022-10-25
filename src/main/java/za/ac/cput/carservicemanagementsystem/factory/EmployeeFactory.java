package za.ac.cput.carservicemanagementsystem.factory;

import za.ac.cput.carservicemanagementsystem.entity.Employee;
import za.ac.cput.carservicemanagementsystem.entity.UserCredentials;

public class EmployeeFactory {
    public static Employee createEmployee(String name, String lastName, String email, String password) {
        UserCredentials userCredentials = UserCredentialFactory.createUserCredentials(name, lastName, email, password);


        return Employee.builder()
                .user(userCredentials)
                .build();
    }
}
