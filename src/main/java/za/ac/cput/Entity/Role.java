/**Entity for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
 */
package za.ac.cput.Entity;

public enum Role {
    ADMIN(1),
    CUSTOMER(2),
    EMPLOYEE(3);

    public final int roleCode;

    Role(int roleCode) {
        this.roleCode = roleCode;
    }

    public int getRoleCode() {
        return this.roleCode;
    }
}
