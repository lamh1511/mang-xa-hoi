package com.example.huynh.models;

/**
 * Created by phucr on 1/20/2018.
 */

public class KetBan {
    int imgAvatar;
    String name;
    String banbechung;

    public KetBan() {
    }

    public KetBan(int imgAvatar, String name, String banbechung) {
        this.imgAvatar = imgAvatar;
        this.name = name;
        this.banbechung = banbechung;
    }

    public int getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(int imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanbechung() {
        return banbechung;
    }

    public void setBanbechung(String banbechung) {
        this.banbechung = banbechung;
    }
}
