package com.example.huynh.XuLyDangNhap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.huynh.mxh.R;


public class ManHinhQuenMatKhauActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_quen_mat_khau);
        toolbar= (Toolbar) findViewById(R.id.toolbarQuenMatKhau);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_quen_matkhau,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.mnuDangNhap){
            Intent intent1=new Intent(ManHinhQuenMatKhauActivity.this, ManHinhDangNhapActivity.class);
            startActivity(intent1);
        }else if(item.getItemId()==R.id.mnuDangKy){
            Intent intent2=new Intent(ManHinhQuenMatKhauActivity.this, ManHinhDangKyActivity.class);
            startActivity(intent2);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
