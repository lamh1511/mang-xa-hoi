package com.example.huynh.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by huynh on 1/19/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter
{
    ArrayList<Fragment> dsFragment = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return dsFragment.get(position);
    }

    @Override
    public int getCount() {
        return dsFragment.size();
    }

    public void addFragmentToArrayList(Fragment fragment){
            dsFragment.add(fragment);
    }
}
