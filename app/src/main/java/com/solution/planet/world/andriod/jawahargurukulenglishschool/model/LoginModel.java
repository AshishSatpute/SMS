package com.solution.planet.world.andriod.jawahargurukulenglishschool.model;

public class LoginModel {
    private String UserId;
    private String Password;
    private String LoginType;



    public LoginModel(String userId, String password, String loginType) {
        UserId = userId;
        Password = password;
        LoginType = loginType;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLoginType() {
        return LoginType;
    }

    public void setLoginType(String loginType) {
        LoginType = loginType;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "UserId='" + UserId + '\'' +
                ", Password='" + Password + '\'' +
                ", LoginType='" + LoginType + '\'' +
                '}';
    }
}
