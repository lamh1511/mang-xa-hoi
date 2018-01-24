package com.example.huynh.Menu_ManHinhChinhSua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.huynh.mxh.R;

public class ManHinhChinhSuaActivity extends AppCompatActivity {
    //Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh_sua);
//        btn = (Button) findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MenuFragment mFragment = new MenuFragment();
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.setCustomAnimations(R.anim.move_top, 0);
//                fragmentTransaction.replace(R.id.frameLayoutMenu, mFragment);
//                fragmentTransaction.commit();
//            }
//        });
    }
}
