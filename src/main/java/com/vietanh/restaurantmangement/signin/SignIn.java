package com.vietanh.restaurantmangement.signin;

import com.vietanh.restaurantmangement.system.BcryptPassword;

public class SignIn {
    private String userName;
    private String passWord;

    public SignIn() {
    }

    public SignIn(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
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

    public Boolean vadidationPassWord(String passWord, String encodedPassword) {
        return new BcryptPassword().matches(passWord, encodedPassword);
    }
}
