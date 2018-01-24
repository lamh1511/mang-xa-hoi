package com.example.huynh.models;

import java.io.Serializable;

/**
 * Created by Pc on 1/22/2018.
 */

public class Menu implements Serializable{
    int Icon,Arrow;
    String title;

    public Menu() {
    }

    public Menu(int icon, int arrow, String title) {
        Icon = icon;
        Arrow = arrow;
        this.title = title;
    }

    public int getIcon() {
        return Icon;
    }

    public void setIcon(int icon) {
        Icon = icon;
    }

    public int getArrow() {
        return Arrow;
    }

    public void setArrow(int arrow) {
        Arrow = arrow;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
