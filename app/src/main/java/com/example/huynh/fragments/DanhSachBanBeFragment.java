package com.example.huynh.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huynh.mxh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanhSachBanBeFragment extends Fragment {


    public DanhSachBanBeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_danh_sach_ban_be, container, false);
    }

}
