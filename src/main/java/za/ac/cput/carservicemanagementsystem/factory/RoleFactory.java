/**
 Author: Kurtney Jantjies (218138105)
 */s
package za.ac.cput.carservicemanagementsystem.factory;

import za.ac.cput.carservicemanagementsystem.entity.Role;
import za.ac.cput.carservicemanagementsystem.util.Helper;

public class RoleFactory {
    public static Role createRole(String name, String description) {
        Helper.checkStringParam(name, "RoleName");
        Helper.checkStringParam(description, "Description");

        return Role.builder()
                .roleName(name)
                .description(description)
                .build();
    }
}
