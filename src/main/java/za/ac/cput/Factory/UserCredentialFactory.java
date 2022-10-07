package za.ac.cput.Factory;

import za.ac.cput.Entity.UserCredentials;
import za.ac.cput.Utilities.Helper;

public class UserCredentialFactory {
    public static UserCredentials createUserCredentials(String name, String lastName, String email, String password) {
        Helper.checkStringParam(name, "Name");
        Helper.checkStringParam(lastName, "LastName");
        Helper.checkStringParam(email, "Email");
        Helper.checkEmail(email);
        Helper.checkStringParam(password, "Password");

        return UserCredentials.builder()
                .name(name)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
    }
}
