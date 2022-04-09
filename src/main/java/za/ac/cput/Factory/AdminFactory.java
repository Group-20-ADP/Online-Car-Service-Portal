/**
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date:
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.*;
import za.ac.cput.Utilities.Helper;

public class AdminFactory {
    //creating user obj
    public static Admin createAdmin(int adminID, Role adminRole, String adminName, String adminEmail, String adminPassword){
        if(Helper.isEmpty(adminName)
                || Helper.isEmpty(adminPassword)){
            return null;
        }

        if(!Helper.isValidEmail(adminEmail)){
            System.out.println("Check Email!!!");
            return null;
        }
        return new Admin.AdminBuilder()
                .setRoleID(adminRole)
                .setAdminID(adminID)
                .setAdminName(adminName)
                .setAdminEmail(adminEmail)
                .setAdminPassword(adminPassword)
                .build();
    }
}
