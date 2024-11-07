package com.viethcn.myapplication;

public class Product {
    private int img;
    private String ten;
    private int gia;
    private String mo_ta;

    public Product(int img, String ten, int gia) {
        this.img = img;
        this.ten = ten;
        this.gia = gia;
    }

    public Product(int img, String ten, int gia, String mo_ta) {
        this.img = img;
        this.ten = ten;
        this.gia = gia;
        this.mo_ta = mo_ta;
    }

    // Getter và Setter
    public int getImg() {
        return img;
    }
    public String getName() {
        return ten;
    }
    public int getPrice() {
        return gia;
    }
    public String getMo_ta() {
        return mo_ta;
    }

    public void setImg(int img) {
        this.img = img;
    }
    public void setName(String ten) {
        this.ten = ten;
    }
    public void setPrice(int gia) {
        this.gia = gia;
    }
    public void setDescription(String mo_ta) {
        this.mo_ta = mo_ta;
    }
}
