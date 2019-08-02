package com.process.bwy.study.customview.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.process.bwy.study.R;
import com.process.bwy.study.customview.CircleView;

public class CustomViewActivity extends AppCompatActivity {
    CircleView circleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        circleView = findViewById(R.id.circle_view);
    }
}
