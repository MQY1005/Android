package com.example.myapplication.entity;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Exercise implements Serializable {
    private int id;
    private  String title;
    private  String subTitle;
    private  int background;
    private String bgColor;

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", background=" + background +
                ", bgColor='" + bgColor + '\'' +
                '}';
    }


    public Exercise() {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.background = background;
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

    public Drawable getBackground() {
        return null;
    }

    public void setBackground(int background) {
        this.background = background;
    }



}
