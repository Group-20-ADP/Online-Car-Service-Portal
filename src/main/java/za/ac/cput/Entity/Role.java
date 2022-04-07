/**Entity for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
 */
package za.ac.cput.Entity;

public class Role {
    private int roleID;
    private String name;

    private Role(RoleBuilder builder){
        this.roleID = builder.roleID;
        this.name = builder.name;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class RoleBuilder{
        private int roleID;
        private String name;

        public RoleBuilder setRoleID(int roleID){
            this.roleID = roleID;
            return this;
        }

        public RoleBuilder setRoleName(String roleName){
            this.name = roleName;
            return this;
        }

        public RoleBuilder copy(Role role){
            this.roleID = role.roleID;
            this.name = role.name;
            return this;
        }

        public Role build(){
            return new Role(this);
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", name='" + name + '\'' +
                '}';
    }
}
