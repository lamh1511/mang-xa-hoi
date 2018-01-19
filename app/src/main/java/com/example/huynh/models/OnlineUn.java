package com.example.huynh.models;

/**
 * Created by huynh on 1/19/2018.
 */

public class OnlineUn
{
    private int hinh;
    private String ten;

    public OnlineUn() {
    }

    public OnlineUn(int hinh, String ten) {
        this.hinh = hinh;
        this.ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
