package za.ac.cput.Factory;

import za.ac.cput.Entity.*;

public class AuthenticationFactory {
    public static Authentication createAuthentication(int authID, String username, String password) {
        return new Authentication.authBuilder()
                .authID(authID)
                .username(username)
                .password(password)
                .build();
    }
}
