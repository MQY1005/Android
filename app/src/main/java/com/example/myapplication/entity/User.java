package com.example.myapplication.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int _id;
    private String username;
    private String sex;
    private String signature;

    public User() {
    }

    public User(String username, String sex, String signature) {
        this.username = username;
        this.sex = sex;
        this.signature = signature;
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
