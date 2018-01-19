package com.example.huynh.models;

import java.util.ArrayList;

/**
 * Created by huynh on 1/20/2018.
 */

public class TinTuc
{
    private int hinh;
    private String ten;
    private String ngayDang;
    private String diaChi;
    private String gioiHanXem;
    private String noiDungChu;
    private int noiDungHinh;
    private int thich;
    private int binhLuan;

    public TinTuc() {
    }

    public TinTuc(int hinh, String ten, String ngayDang, String diaChi, String gioiHanXem, String noiDungChu, int noiDungHinh, int thich, int binhLuan) {
        this.hinh = hinh;
        this.ten = ten;
        this.ngayDang = ngayDang;
        this.diaChi = diaChi;
        this.gioiHanXem = gioiHanXem;
        this.noiDungChu = noiDungChu;
        this.noiDungHinh = noiDungHinh;
        this.thich = thich;
        this.binhLuan = binhLuan;
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

    public String getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(String ngayDang) {
        this.ngayDang = ngayDang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiHanXem() {
        return gioiHanXem;
    }

    public void setGioiHanXem(String gioiHanXem) {
        this.gioiHanXem = gioiHanXem;
    }

    public String getNoiDungChu() {
        return noiDungChu;
    }

    public void setNoiDungChu(String noiDungChu) {
        this.noiDungChu = noiDungChu;
    }

    public int getNoiDungHinh() {
        return noiDungHinh;
    }

    public void setNoiDungHinh(int noiDungHinh) {
        this.noiDungHinh = noiDungHinh;
    }

    public int getThich() {
        return thich;
    }

    public void setThich(int thich) {
        this.thich = thich;
    }

    public int getBinhLuan() {
        return binhLuan;
    }

    public void setBinhLuan(int binhLuan) {
        this.binhLuan = binhLuan;
    }
}
