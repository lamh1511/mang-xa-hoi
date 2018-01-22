package com.example.huynh.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.huynh.adapters.DanhSachBanBeAdapter;
import com.example.huynh.models.KetBan;
import com.example.huynh.mxh.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanhSachBanBeFragment extends Fragment {


    ListView lvBanBe;
    ArrayList<KetBan> arrayList;
    DanhSachBanBeAdapter arrayAdapter,arrayAdapter1;
    public DanhSachBanBeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_danh_sach_ban_be,container,false);

        arrayList=new ArrayList<>();
        arrayList.add(new KetBan(R.drawable.female,"Dương Mịch","3 bạn bè chung"));
        arrayList.add(new KetBan(R.drawable.avatar,"Triệu Lệ Dĩnh","3 bạn bè chung"));
        arrayList.add(new KetBan(R.drawable.female,"Dương Mịch","3 bạn bè chung"));
        arrayList.add(new KetBan(R.drawable.female,"Dương Mịch","3 bạn bè chung"));
        arrayList.add(new KetBan(R.drawable.female,"Dương Mịch","3 bạn bè chung"));


        lvBanBe=view.findViewById(R.id.lvBanBe);

        arrayAdapter=new DanhSachBanBeAdapter(getContext(),R.layout.item_ketban,arrayList);

        lvBanBe.setAdapter(arrayAdapter);
        return view;
    }

}
