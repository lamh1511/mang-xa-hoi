package com.example.huynh.ManHinhDangKy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.huynh.ManHinhDangNhap.ManHinhDangNhapActivity;
import com.example.huynh.mxh.R;


public class ManHinhDangKyActivity extends AppCompatActivity {

    TextView txtDangNhapNgay;
    Toolbar toolbar;
    TextView txtGender;
    Spinner spinner;
    String arrayList[]={"Nam","Nữ"};
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_dang_ky);
        txtDangNhapNgay= (TextView) findViewById(R.id.txtDangNhapNgay);
        txtDangNhapNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ManHinhDangKyActivity.this, ManHinhDangNhapActivity.class);
                startActivity(intent1);


            }
        });

        toolbar= (Toolbar) findViewById(R.id.toolbarDangKy);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txtGender= (TextView) findViewById(R.id.txtGender);
        spinner= (Spinner) findViewById(R.id.spinnerGender);

        arrayAdapter=new ArrayAdapter<String>(ManHinhDangKyActivity.this,android.R.layout.simple_spinner_item,arrayList);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(arrayAdapter);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
