package za.ac.cput.Factory;

import za.ac.cput.Entity.Login;
import za.ac.cput.Utilities.Helper;

public class LoginFactory {
    public static Login createLog(String userName, String passWord){
        if(Helper.isNotempty(userName))
            return null;
        Helper.isValidPassword(passWord);
        return new Login.Builder().setuserName(userName)
                .setPassWord(passWord)
                .builder();

    }
}
