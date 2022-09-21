package com.example.datejot;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    /*variables
    int ScreenWidthDp;
    int ScreenHeightDp;
    TextView TimeText;
    Date CurrentDate;
    final Configuration configuration = this.getResources().getConfiguration();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Setup();
    }
    /*public void Setup() {
        ScreenWidthDp = configuration.screenWidthDp; ScreenHeightDp = configuration.screenHeightDp;
        if (ScreenWidthDp >= 1023 || ScreenHeightDp >= 1023) {
            setContentView(R.layout.activity_main_tablet);
        }else {
            setContentView(R.layout.activity_main_phone);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        TimeText = findViewById(R.id.TimeText);
        CurrentDate = Calendar.getInstance().getTime();
    }*/
}