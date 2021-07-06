package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.libcommon.utils.StatusBar;
import com.example.libnavannotation.ActivityDestination;

@ActivityDestination(pageUrl = "main/tabs/main", needLogin = false)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        StatusBar.fitSystemBar(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}