package com.example.huynh.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.huynh.models.KetBan;
import com.example.huynh.mxh.R;

import java.util.List;

/**
 * Created by phucr on 1/20/2018.
 */

public class DanhSachBanBeAdapter extends ArrayAdapter<KetBan> {

    @NonNull
    Context context;
    int resource;
    @NonNull List<KetBan> objects;
    public DanhSachBanBeAdapter(@NonNull Context context, int resource, @NonNull List<KetBan> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View row = inflater.inflate(this.resource,null);
        ImageView imgAvatar=row.findViewById(R.id.imgAvatar);
        TextView txtNameFriend=row.findViewById(R.id.txtNameFriend);
        TextView txtBanChung=row.findViewById(R.id.txtBanChung);
        Button btnThemBanBe=row.findViewById(R.id.btnChapNhan);
        Button btnXoa=row.findViewById(R.id.btnXoa);
        KetBan ketban=this.objects.get(position);

        imgAvatar.setImageResource(ketban.getImgAvatar());
        txtNameFriend.setText(ketban.getName());
        txtBanChung.setText(ketban.getBanbechung());
        return row;
    }
}
