/**Entity for the User
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date: 28 March 2022s
 */
package za.ac.cput.Entity;

public class Admin {
    private int adminID;
    private Role roleID;
    private String adminName;
    private String adminEmail;
    private String adminPassword;

    public Admin(AdminBuilder adminBuilder) {
        this.adminID = adminBuilder.adminID;
        this.roleID = adminBuilder.roleID;
        this.adminName = adminBuilder.adminName;
        this.adminEmail = adminBuilder.adminEmail;
        this.adminPassword = adminBuilder.adminPassword;
    }

    public static class AdminBuilder{
        private int adminID;
        private Role roleID;
        private String adminName;
        private String adminEmail;
        private String adminPassword;

        public AdminBuilder setRoleID(Role roleID){
            this.roleID = roleID;
            return this;
        }

        public AdminBuilder setAdminID(int adminID){
            this.adminID = adminID;
            return this;
        }

        public AdminBuilder setAdminName(String adminName){
            this.adminName = adminName;
            return this;
        }

        public AdminBuilder setAdminEmail(String adminEmail){
            this.adminEmail = adminEmail;
            return this;
        }

        public AdminBuilder setAdminPassword(String adminPassword){
            this.adminPassword = adminPassword;
            return this;
        }

        public AdminBuilder copy(Admin admin){
            this.roleID = admin.roleID;
            this.adminID = admin.adminID;
            this.adminName = admin.adminName;
            this.adminEmail = admin.adminEmail;
            this.adminPassword = admin.adminPassword;
            return this;
        }

        public Admin build(){
            return new Admin(this);
        }



    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public Role getRoleID() {
        return roleID;
    }

    public void setRoleID(Role roleID) {
        this.roleID = roleID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", roleID=" + roleID +
                ", adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
