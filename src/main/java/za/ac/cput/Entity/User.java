/**
 Author: Kurtney Clyde Jantjies (218138105)
 MileStone Date:
 */
package za.ac.cput.Entity;

public class User {
    private int userID;
    private  Role userRole;
    private String userName;
    private String userEmail;
    private String userPassword;

    private User(UserBuilder builder) {
        this.userID = builder.userID;
        this.userRole = builder.userRole;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.userPassword = builder.userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public static class UserBuilder {
        private int userID;
        private  Role userRole;
        private String userName, userEmail, userPassword;

        public UserBuilder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public UserBuilder setUserRole(Role userRole) {
            this.userRole = userRole;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public UserBuilder setUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public UserBuilder copy(User user){
             this.userID = user.userID;
             this.userRole = userRole;
             this.userName = user.userName;
             this.userEmail = user.userEmail;
             this.userPassword = user.userPassword;
             return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userRole=" + userRole +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
