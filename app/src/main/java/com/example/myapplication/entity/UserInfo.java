package com.example.myapplication.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private int _id;
    private String username;
    private String sex;
    private String signature;
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public UserInfo() {
    }

    public UserInfo(String username, String sex, String signature,String nickname) {
        this.username = username;
        this.sex = sex;
        this.signature = signature;
        this.nickname=nickname;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }


    public void setSignature(String signature) {
        this.signature = signature;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }

}


