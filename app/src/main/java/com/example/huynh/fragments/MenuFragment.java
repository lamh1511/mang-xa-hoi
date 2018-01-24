package com.example.huynh.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ListView;
import android.widget.TextView;

import com.example.huynh.DanhSach.DanhSachMenu;
import com.example.huynh.Menu_ManHinhChinhSua.ManHinhChinhSuaActivity;
import com.example.huynh.adapters.MenuApdapter;
import com.example.huynh.customs.HeightListView;
import com.example.huynh.models.Menu;
import com.example.huynh.mxh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    ListView lvDanhSachKhamPha;
    ArrayList<Menu> khamPhaArrayList;
    MenuApdapter khamPhaApdapter;

    ListView lvDanhSachCaiDat;
    ArrayList<Menu> caiDatArrayList;
    MenuApdapter caiDatApdapter;

    TextView txtvChinhSua;
    Animation animation;
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        lvDanhSachKhamPha = view.findViewById(R.id.lvDanhSachKhamPha);
        khamPhaArrayList = DanhSachMenu.khoiTaoDanhSachKhamPha(getContext());
        khamPhaApdapter = new MenuApdapter(getActivity(), R.layout.item_menu, khamPhaArrayList);
        lvDanhSachKhamPha.setAdapter(khamPhaApdapter);

        lvDanhSachCaiDat = view.findViewById(R.id.lvDanhSachCaiDat);
        caiDatArrayList =  DanhSachMenu.khoiTaoDanhSachCaiDat(getContext());
        caiDatApdapter = new MenuApdapter(getActivity(),R.layout.item_menu,caiDatArrayList);
        lvDanhSachCaiDat.setAdapter(caiDatApdapter);

        txtvChinhSua = view.findViewById(R.id.txtvChinhSua);

        //Vì listview nằm trong scrollview nên danh sách trong list bị scrollview ảnh hưởng => tính độ dài listview
        HeightListView.justifyListViewHeightBasedOnChildren(lvDanhSachKhamPha);
        khamPhaApdapter.notifyDataSetChanged();

        HeightListView.justifyListViewHeightBasedOnChildren(lvDanhSachCaiDat);
        caiDatApdapter.notifyDataSetChanged();

        txtvChinhSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ManHinhChinhSuaActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.move_down,0);
            }
        });

        return view;
    }

}
