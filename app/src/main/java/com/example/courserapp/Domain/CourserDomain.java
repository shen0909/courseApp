package com.example.courserapp.Domain;

public class CourserDomain {
    private String title,picPath;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CourserDomain(String title, String picPath, double price) {
        this.title = title;
        this.picPath = picPath;
        this.price = price;
    }
}
