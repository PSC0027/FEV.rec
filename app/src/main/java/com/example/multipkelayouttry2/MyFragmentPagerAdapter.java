package com.example.multipkelayouttry2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private FFTFragment mFFTFragment;
    private SpeedFragment mSpeedFragment;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

        mFFTFragment = new FFTFragment();
        mSpeedFragment = new SpeedFragment();
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        if(i == 0) {
            fragment = mSpeedFragment;
        }
        else if(i == 1) {
            fragment = mFFTFragment;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
