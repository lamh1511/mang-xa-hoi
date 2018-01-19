package com.example.huynh.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.huynh.adapters.OnlineUnAdapter;
import com.example.huynh.adapters.TinTucAdapter;
import com.example.huynh.customs.CircleImage;
import com.example.huynh.models.OnlineUn;
import com.example.huynh.models.TinTuc;
import com.example.huynh.mxh.MainActivity;
import com.example.huynh.mxh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrangChuFragment extends Fragment {

    RecyclerView listOnlineUn;
    ArrayList<OnlineUn> onlineUns;
    OnlineUnAdapter onlineUnAdapter;

    ListView lvTinTuc;
    ArrayList<TinTuc> danhSachTinTuc;
    TinTucAdapter tinTucAdapter;

    public TrangChuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_trang_chu, container, false);

        listOnlineUn = v.findViewById(R.id.listOnlineUn);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
        listOnlineUn.setLayoutManager(staggeredGridLayoutManager);
        listOnlineUn.setLayoutManager(staggeredGridLayoutManager);

        onlineUns = new ArrayList<>();
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));
        onlineUns.add(new OnlineUn(R.drawable.neko,"Neko"));

        onlineUnAdapter = new OnlineUnAdapter(getContext(),onlineUns,R.layout.item_onlineun);
        listOnlineUn.setAdapter(onlineUnAdapter);


//        Tin Tức
        danhSachTinTuc = new ArrayList<>();
        danhSachTinTuc.add(
                new TinTuc(R.drawable.neko,
                        "Neko-chan","20/1/2018",
                        "Thành phố HCM",
                        "BanBe",
                        "Đây là nội dung nè!!!",
                        R.drawable.neko,5,5));
        danhSachTinTuc.add(
                new TinTuc(R.drawable.neko,
                        "Neko-chan","20/1/2018",
                        "Thành phố HCM",
                        "BanBe",
                        "Đây là nội dung nè!!!",
                        R.drawable.neko,5,5));
        danhSachTinTuc.add(
                new TinTuc(R.drawable.neko,
                        "Neko-chan","20/1/2018",
                        "Thành phố HCM",
                        "BanBe",
                        "Đây là nội dung nè!!!",
                        R.drawable.neko,5,5));
        danhSachTinTuc.add(
                new TinTuc(R.drawable.neko,
                        "Neko-chan","20/1/2018",
                        "Thành phố HCM",
                        "BanBe",
                        "Đây là nội dung nè!!!",
                        R.drawable.neko,5,5));
        danhSachTinTuc.add(
                new TinTuc(R.drawable.neko,
                        "Neko-chan","20/1/2018",
                        "Thành phố HCM",
                        "BanBe",
                        "Đây là nội dung nè!!!",
                        R.drawable.neko,5,5));
        tinTucAdapter = new TinTucAdapter(getContext(),R.layout.item_timtuc,danhSachTinTuc);
        lvTinTuc = v.findViewById(R.id.lvTinTuc);
        lvTinTuc.setAdapter(tinTucAdapter);

        return v;
    }

}
