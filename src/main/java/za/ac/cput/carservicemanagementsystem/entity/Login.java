package za.ac.cput.Entity;

public class Login {
    private String userName,passWord;

    private Login(Builder builder){
        this.userName = builder.userName;
        this.passWord = builder.passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Log{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
    public static class Builder{
        private String userName,passWord;
        public Builder setuserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPassWord(String passWord) {
            this.passWord = passWord;
            return this;
        }
        public Builder copy(Login log){
            this.userName = log.userName;
            this.passWord= log.passWord;
            return this;
        }
        public Login builder(){
            return new Login(this);
        }
    }
}
