/**
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date:
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.*;
import za.ac.cput.Utilities.*;

public class UserFactory {

    //creating user obj
    public static User createUser(int userID, Role userRole, String userName, String userEmail, String userPassword){
        if(Helper.isEmpty(userName)
                || Helper.isEmpty(userPassword)){
            return null;
        }

        if(!Helper.isValidEmail(userEmail)){
            System.out.println("Check Email!!!");
            return null;
        }
        return new User.UserBuilder()
                .setUserID(userID)
                .setUserRole(userRole)
                .setUserName(userName)
                .setUserEmail(userEmail)
                .setUserPassword(userPassword)
                .build();
    }
}
