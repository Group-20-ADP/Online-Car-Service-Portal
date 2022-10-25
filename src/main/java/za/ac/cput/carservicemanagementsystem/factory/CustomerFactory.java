package za.ac.cput.carservicemanagementsystem.factory;

import za.ac.cput.carservicemanagementsystem.entity.Customer;
import za.ac.cput.carservicemanagementsystem.entity.UserCredentials;

public class CustomerFactory {
    public static Customer createCustomer(String name,String lastName,String email,String password) {
        UserCredentials userCredentials = UserCredentialFactory.createUserCredentials(name, lastName, email, password);


        return Customer.builder()
                .userCredentials(userCredentials)
                .build();
    }
}

