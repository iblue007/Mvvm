package com.example.mvvm.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppBottomBar extends BottomNavigationView {

    public AppBottomBar(@NonNull Context context) {
        super(context);
    }

    public AppBottomBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AppBottomBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
