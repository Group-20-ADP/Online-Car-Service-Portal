package za.ac.cput.Entity;

public class Authentication {
    private int authID;
    private String username;
    private String password;

    //Builder for authentication
    public Authentication(authBuilder builder) {
        this.authID = builder.authID;
        this.username = builder.username;
        this.password = builder.password;
    }

    //Getters and setters
    public int getAuthID() {
        return authID;
    }

    public void setAuthID(int authID) {
        this.authID = authID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Builder
    public static class authBuilder{
        private int authID;
        private String username;
        private String password;

        public authBuilder authID(int authID){
            this.authID = authID;
            return this;
        }

        public authBuilder username(String username){
            this.username = username;
            return this;
        }

        public authBuilder password(String password){
            this.password = password;
            return this;
        }

        public authBuilder copy(Authentication authentication){
            this.authID = authentication.authID;
            this.username = authentication.username;
            this.password = authentication.password;
            return this;
        }

        public Authentication build(){
            return new Authentication(this);
        }
    }
    @Override
    public String toString() {
        return "Authentication{" +
                "authID=" + authID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
