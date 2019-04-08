package com.example.multipkelayouttry2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {

    Button RecordButton;
    ImageButton settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        RecordButton = (Button) findViewById(R.id.RecordButton);
        settingButton = (ImageButton) findViewById(R.id.SettingButton);


        RecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RecordIntent = new Intent(StartActivity.this,RpmSpectrumActivity.class);
                startActivity(RecordIntent);
//                RecordButton.setText(R.string.PauseButtonName);
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingIntent = new Intent(StartActivity.this,Setting.class);
                startActivity(settingIntent);
            }
        });
    }
}
