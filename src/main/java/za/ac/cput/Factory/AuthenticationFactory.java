package za.ac.cput.Factory;

import za.ac.cput.Entity.*;
import za.ac.cput.Utilities.Helper;

public class AuthenticationFactory {
    public static Authentication createAuthentication(String authID, String username, String password) {

        String setAuthID = Helper.generateID();
        return new Authentication.authBuilder()
                .authID(setAuthID)
                .username(username)
                .password(password)
                .build();
    }
}
