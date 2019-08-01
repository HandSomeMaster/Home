package com.process.bwy.study.animation.activity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.process.bwy.study.R;

/*
 *create by HandSame
 */
public class DrawableAnimActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_anim);
        imageView = findViewById(R.id.drawable_img);
        imageView.setImageResource(R.drawable.drawable_anim);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();
//animationDrawable.stop(); //如果oneshot为false，必要时要停止动画


        /**
         * 也可以代码实现
         * //代码定义、创建、执行动画
         * AnimationDrawable animationDrawable = new AnimationDrawable();
         * animationDrawable.addFrame(getResources().getDrawable(R.drawable.first_pic), 1000);
         * animationDrawable.addFrame(getResources().getDrawable(R.drawable.second_pic), 1000);
         * animationDrawable.addFrame(getResources().getDrawable(R.drawable.third_pic), 1000);
         * animationDrawable.addFrame(getResources().getDrawable(R.drawable.fourth_pic), 1000);
         * animationDrawable.addFrame(getResources().getDrawable(R.drawable.fifth_pic), 1000);
         * animationDrawable.addFrame(getResources().getDrawable(R.drawable.sixth_pic), 1000);
         * animationDrawable.setOneShot(true);
         * image.setImageDrawable(animationDrawable);
         * animationDrawable.start();
         */
    }
}
