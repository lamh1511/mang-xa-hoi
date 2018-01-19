package com.example.huynh.mxh;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.huynh.adapters.ViewPagerAdapter;
import com.example.huynh.fragments.DanhSachBanBeFragment;
import com.example.huynh.fragments.MenuFragment;
import com.example.huynh.fragments.ThongBaoFragment;
import com.example.huynh.fragments.TrangChuFragment;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;

    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragmentToArrayList(new TrangChuFragment());
        viewPagerAdapter.addFragmentToArrayList(new DanhSachBanBeFragment());
        viewPagerAdapter.addFragmentToArrayList(new ThongBaoFragment());
        viewPagerAdapter.addFragmentToArrayList(new MenuFragment());
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);

        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        tabs.getTabAt(0).setIcon(R.drawable.ic_grid);
        tabs.getTabAt(1).setIcon(R.drawable.ic_friend);
        tabs.getTabAt(2).setIcon(R.drawable.ic_notification);
        tabs.getTabAt(3).setIcon(R.drawable.ic_menu);
    }

    private void addEvents() {

    }
}
