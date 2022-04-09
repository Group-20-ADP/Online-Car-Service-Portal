/**
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date:
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Admin;
import za.ac.cput.Entity.Role;
import za.ac.cput.Utilities.Helper;

public class RoleFactory {
    //creating user obj
    public static Role createRole(int roleID, String roleDescription){
        if(Helper.isEmpty(roleDescription)){
            return null;
        }
        return new Role.RoleBuilder()
                .setRoleID(roleID)
                .setRoleName(roleDescription)
                .build();
    }
}
