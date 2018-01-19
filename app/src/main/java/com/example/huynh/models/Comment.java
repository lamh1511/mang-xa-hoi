package com.example.huynh.models;

/**
 * Created by huynh on 1/20/2018.
 */

public class Comment
{
    private int hinh;
    private String ten;
    private String noiDungBinhLuan;
    private int gio;
    private int thich;

    public Comment() {
    }

    public Comment(int hinh, String ten, String noiDungBinhLuan, int gio, int thich) {
        this.hinh = hinh;
        this.ten = ten;
        this.noiDungBinhLuan = noiDungBinhLuan;
        this.gio = gio;
        this.thich = thich;
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

    public String getNoiDungBinhLuan() {
        return noiDungBinhLuan;
    }

    public void setNoiDungBinhLuan(String noiDungBinhLuan) {
        this.noiDungBinhLuan = noiDungBinhLuan;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getThich() {
        return thich;
    }

    public void setThich(int thich) {
        this.thich = thich;
    }
}
