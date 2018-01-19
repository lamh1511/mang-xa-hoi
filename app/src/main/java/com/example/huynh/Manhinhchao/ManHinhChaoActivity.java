package com.example.huynh.Manhinhchao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.huynh.ManHinhDangNhap.ManHinhDangNhapActivity;
import com.example.huynh.mxh.R;


public class ManHinhChaoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                }
                catch(Exception e){

                }
                finally{
                    Intent intent=new Intent(ManHinhChaoActivity.this, ManHinhDangNhapActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        thread.start();
    }

}
