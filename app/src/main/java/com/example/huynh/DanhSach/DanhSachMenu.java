package com.example.huynh.DanhSach;

import android.content.Context;

import com.example.huynh.models.Menu;
import com.example.huynh.mxh.R;

import java.util.ArrayList;

/**
 * Created by Pc on 1/22/2018.
 */

public class DanhSachMenu {

    public static ArrayList<Menu> khoiTaoDanhSachKhamPha(Context context){
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Menu(R.drawable.team, R.drawable.ic_keyboard_arrow_right_black_24dp,"Bạn bè"));
        menus.add(new Menu(R.drawable.save24, R.drawable.ic_keyboard_arrow_right_black_24dp,"Nguồn cấp"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Đã lưu"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Địa điểm gần đây"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Trang"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Nhóm"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Hướng dẫn về thành phố"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Instagram"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Mã QR"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Ngày này năm xưa"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Bạn bè gần đây"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Tìm Wi-Fi"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Bảo vệ"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Yêu cầu từ thiết bị"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Sự kiện"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Thể thao"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Trò chơi tức thời"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Video trực tiếp"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Ứng dụng"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Hoạt động quản cáo gần đây"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Thời tiết"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Ưu đãi"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Khám phá mọi người"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Đề xuất"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Khám phá chủ đề hot"));
        menus.add(new Menu(R.drawable.ic_people_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Ứng phó khẩn cấp"));

        return menus;
    }
    public static ArrayList<Menu> khoiTaoDanhSachCaiDat(Context context){
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Menu(R.drawable.ic_settings_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Cài đặt"));
        menus.add(new Menu(R.drawable.ic_lock_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Lối tắt quyền riêng tư"));
        menus.add(new Menu(R.drawable.ic_help_black_24dp, R.drawable.ic_keyboard_arrow_right_black_24dp,"Trợ giúp và hổ trợ"));
        menus.add(new Menu(R.drawable.qrcodes, R.drawable.ic_keyboard_arrow_right_black_24dp,"Mã QR"));
        return menus;
    }


}
