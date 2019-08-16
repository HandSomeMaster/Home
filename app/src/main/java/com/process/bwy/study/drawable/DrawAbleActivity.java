package com.process.bwy.study.drawable;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.process.bwy.study.R;

import org.w3c.dom.Text;

public class DrawAbleActivity extends AppCompatActivity {

    ImageView testImg;
    TextView screenTv;
    private float screenWidth,screenHeight;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        screenTv = findViewById(R.id.aty_drawable_screen_size);
         screenWidth = getResources().getDisplayMetrics().xdpi;
         screenHeight = getResources().getDisplayMetrics().ydpi;
         screenTv.setText("宽度宽度："+screenWidth+"  "+"屏幕高度："+screenHeight);
    }
}
