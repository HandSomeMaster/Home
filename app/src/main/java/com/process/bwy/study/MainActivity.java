package com.process.bwy.study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.process.bwy.study.animation.activity.AnimationActivity;
import com.process.bwy.study.customview.activity.CustomViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button animationBtn;
    private Button customeViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationBtn = findViewById(R.id.animation_btn);
        customeViewBtn = findViewById(R.id.custom_view_btn);
        animationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
            }
        });
        customeViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
