package com.example.myapplication.entity;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Exercise implements Serializable {
    private int id;
    private  String title;
    private  String subTitle;
    private  int backgrount;


    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", backgrount=" + backgrount +
                '}';
    }

    public Exercise(int id, String title, String subTitle, int backgrount) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.backgrount = backgrount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Drawable getBackgrount() {
        return null;
    }

    public void setBackgrount(int backgrount) {
        this.backgrount = backgrount;
    }



}
