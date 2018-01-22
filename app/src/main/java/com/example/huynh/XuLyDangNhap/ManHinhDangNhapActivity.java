package com.example.huynh.XuLyDangNhap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.huynh.mxh.R;


public class ManHinhDangNhapActivity extends AppCompatActivity {

    TextView txtTaoUser,txtQuenMatKhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_dang_nhap);
        txtTaoUser= (TextView) findViewById(R.id.txtTaoUser);
        txtQuenMatKhau= (TextView) findViewById(R.id.txtQuenMatKhau);
        txtTaoUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinhDangNhapActivity.this, ManHinhDangKyActivity.class);
                startActivity(intent);
            }
        });
        txtQuenMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(ManHinhDangNhapActivity.this, ManHinhQuenMatKhauActivity.class);
                startActivity(intent2);
            }
        });
    }
}
