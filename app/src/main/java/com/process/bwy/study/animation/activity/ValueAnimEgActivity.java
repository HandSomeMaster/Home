package com.process.bwy.study.animation.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.process.bwy.study.R;
import com.process.bwy.study.animation.view.ValueLoadingImageView;

public class ValueAnimEgActivity extends AppCompatActivity {
    ValueLoadingImageView valueLoadingImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_anim_eg);
        valueLoadingImageView = findViewById(R.id.value_anim_loading_img);
    }
}
