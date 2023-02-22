package com.example.myapplication;

import java.io.Serializable;

public class ThongTin implements Serializable {

    int img;
    String name;
    String detail;

    public ThongTin(int img, String name, String detail) {
        this.img = img;
        this.name = name;
        this.detail = detail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}