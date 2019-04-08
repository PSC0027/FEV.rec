package com.example.multipkelayouttry2;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RpmSpectrumActivity extends AppCompatActivity {

    Button PauseButton;
    ImageButton settingButton;

    ViewPager mViewPager;
    MyFragmentPagerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rpm_spectrum_activity);

        PauseButton = (Button) findViewById(R.id.PauseButton);
        settingButton = (ImageButton) findViewById(R.id.SettingButton);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());


        PauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingIntent = new Intent(RpmSpectrumActivity.this,Setting.class);
                startActivity(settingIntent);
            }
        });

        mViewPager.setAdapter(mAdapter);
    }
}
