package com.example.doc990;

public class Specialist {

    private String title;
    private String des;

    private int img;

    public Specialist(String title, String des,int img) {
        this.title = title;
        this.des = des;
        this.img = img;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
