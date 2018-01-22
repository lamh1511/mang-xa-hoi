package com.example.huynh.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.huynh.customs.CircleImage;
import com.example.huynh.models.UserThePost;
import com.example.huynh.mxh.R;

import java.util.ArrayList;

/**
 * Created by huynh on 1/20/2018.
 */

public class TinTucAdapter extends ArrayAdapter<UserThePost>
{
    @NonNull Context context;
    @LayoutRes int resource;
    @NonNull ArrayList<UserThePost> objects;

    public TinTucAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<UserThePost> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(this.context);
        View row = inflater.inflate(this.resource,null);

        CircleImage avatarNguoiDang = row.findViewById(R.id.avatarNguoiDang);
        TextView txtvTenNguoiDang = row.findViewById(R.id.txtvTenNguoiDang);
        TextView txtvNgayDang = row.findViewById(R.id.txtvNgayDang);
        TextView txtvDiaChi = row.findViewById(R.id.txtvDiaChi);
        TextView txtvNoiDungChu = row.findViewById(R.id.txtvNoiDungChu);
        ImageView imgvGioiHanXem = row.findViewById(R.id.imgvGioiHanXem);
        ImageView imgvNoiDungHinh = row.findViewById(R.id.imgvNoiDungHinh);
        ImageButton btnThich = row.findViewById(R.id.btnThich);
        ImageButton btnBinhLuan = row.findViewById(R.id.btnBinhLuan);
        ListView lvComment = row.findViewById(R.id.lvComment);

        avatarNguoiDang.setImageResource(objects.get(position).getHinh());
        txtvTenNguoiDang.setText(objects.get(position).getTen());
        txtvNgayDang.setText(objects.get(position).getNgayDang());
        txtvDiaChi.setText(objects.get(position).getDiaChi());
        //imgvGioiHanXem.setImageResource(objects.get(position).getGioiHanXem());
        txtvNoiDungChu.setText(objects.get(position).getNoiDungChu());
        imgvNoiDungHinh.setImageResource(objects.get(position).getNoiDungHinh());


        btnThich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnBinhLuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return row;
    }

}
