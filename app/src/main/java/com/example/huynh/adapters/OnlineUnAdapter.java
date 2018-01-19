package com.example.huynh.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.huynh.customs.CircleImage;
import com.example.huynh.models.OnlineUn;
import com.example.huynh.mxh.R;

import java.util.ArrayList;

/**
 * Created by huynh on 1/19/2018.
 */

public class OnlineUnAdapter extends RecyclerView.Adapter<OnlineUnAdapter.OnlineUnHolder>
{
    Context context;
    ArrayList<OnlineUn> listOnlineUn;
    int layout;

    public OnlineUnAdapter() {
    }

    public OnlineUnAdapter(Context context, ArrayList<OnlineUn> listOnlineUn, int layout) {
        this.context = context;
        this.listOnlineUn = listOnlineUn;
        this.layout = layout;
    }

    @Override
    public OnlineUnHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(this.context);

        View view = inflater.inflate(this.layout,null);

        return new OnlineUnHolder(view);
    }

    @Override
    public void onBindViewHolder(OnlineUnHolder holder, int position) {
        holder.imgOnlineUser.setImageResource(listOnlineUn.get(position).getHinh());
        holder.txtvOnlineUser.setText(listOnlineUn.get(position).getTen());
    }

    @Override
    public int getItemCount() {
        return listOnlineUn.size();
    }

    class OnlineUnHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        CircleImage imgOnlineUser;
        TextView txtvOnlineUser;

        public OnlineUnHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardView);
            imgOnlineUser = itemView.findViewById(R.id.imgOnlineUser);
            txtvOnlineUser = itemView.findViewById(R.id.txtvOnlineUser);

            CircleImage circleImage = itemView.findViewById(R.id.imgOnlineUser);
            circleImage.showImage();
        }
    }
}
