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

    /**
     * 一、 Android有三种动画框架：
     * 1、属性动画   2、View动画（补间动画）  3、逐帧动画
     * 首选属性动画 （更灵活，功能更多）
     * 二、 View动画（补间动画）有四种类型：
     * 1、AlphaAnimation：透明度动画
     * 2、RotateAnimation：旋转动画
     * 3：ScaleAnimation：缩放动画
     * 4：TranslateAnimation：平移动画
     *  View动画提供了动画合集类（animationSet）,通过animationSet可以把多种类型的补间动画以组合
     *  的形式显示出来
     * 三、  属性动画：只要某个类具有属性（即该类含有某个字段的set和get方法），
     *  那么属性动画框架就可以对该类的对象进行动画操作
     *  属性动画框架还提供了动画集合类（AnimatorSet），
     *  通过动画集合类（AnimatorSet）可以将多个属性动画以组合的形式显示出来。
     *  三种类型：
     *  1、ValueAnimator
     *  2、ObjectAnimator
     *  3、TimeAnimator
     * 四、  逐帧动画：Drawable动画
     *  可绘制动画通过一个接一个地加载一系列Drawable资源来创建动画。
     *  这是一个传统的动画，它是用一系列不同的图像创建的，按顺序播放，就像一卷电影
     *  不同于补间动画，逐帧动画资源文件放在drawable文件夹下。
     */
}
