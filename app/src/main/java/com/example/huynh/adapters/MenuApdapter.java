package com.example.huynh.adapters;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.huynh.models.Menu;
import com.example.huynh.mxh.R;

import java.util.List;

/**
 * Created by Pc on 1/22/2018.
 */

public class MenuApdapter extends ArrayAdapter<Menu> {
    @NonNull
    Activity context;
    @LayoutRes int resource;
    @NonNull List<Menu> objects;
    public MenuApdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<Menu> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = this.context.getLayoutInflater().inflate(resource,null);
        ImageView imgIcon = view.findViewById(R.id.imgIcon);
        ImageView imgArrow = view.findViewById(R.id.imgArrow);
        TextView txtvTitle = view.findViewById(R.id.txtvTitle);

        Menu menu = this.objects.get(position);
        imgIcon.setImageResource(menu.getIcon());
        imgArrow.setImageResource(menu.getArrow());
        txtvTitle.setText(menu.getTitle());
        return view;
    }
}
