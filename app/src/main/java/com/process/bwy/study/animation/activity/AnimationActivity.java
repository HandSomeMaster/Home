package com.process.bwy.study.animation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.process.bwy.study.R;

public class AnimationActivity extends AppCompatActivity {
    Button alphaBtn, scaleBtn, rotateBtn, translateBtn,viewAnimationBtn,drawableBtn;
    ImageView imageView;
    Animation alphaAnimation, scaleAnimation, rotateAnimation, translateAnimation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        initView();
        initData();
    }


    private void initView() {
        alphaBtn = findViewById(R.id.alpha_btn);
        scaleBtn = findViewById(R.id.scacle_btn);
        rotateBtn = findViewById(R.id.rotate_btn);
        translateBtn = findViewById(R.id.translate_btn);
        imageView = findViewById(R.id.imageView);
        viewAnimationBtn = findViewById(R.id.view_animation_btn);
        drawableBtn = findViewById(R.id.view_anim_drawable);
    }


    private void initData() {
        alphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlphaAnimation();
            }
        });

        scaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setScaleAnimation();
            }
        });

        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRotateAnimation();
            }
        });

        translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTransLateAnimation();
            }
        });

        viewAnimationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnimationActivity.this,ViewAnimationAgeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activity_enter_anim,R.anim.activity_enter_anim);
            }
        });

        drawableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnimationActivity.this,DrawableAnimActivity.class);
                startActivity(intent);
            }
        });

    }

    /**
     * 平移动画
     */
    private void setTransLateAnimation() {
        translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_animation);
        translateAnimation.setFillAfter(true);
        imageView.startAnimation(translateAnimation);
    }

    /**
     * 旋转动画
     */
    private void setRotateAnimation() {
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        rotateAnimation.setFillAfter(true);
        imageView.startAnimation(rotateAnimation);
    }

    /**
     * 缩放动画
     */
    private void setScaleAnimation() {
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        scaleAnimation.setFillAfter(true);
        imageView.startAnimation(scaleAnimation);
    }


    /**
     * 透明动画
     */
    private void setAlphaAnimation() {
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
        alphaAnimation.setFillAfter(true);
        imageView.startAnimation(alphaAnimation);
    }

}
