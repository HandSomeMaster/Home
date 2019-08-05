package com.process.bwy.study.animation.activity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.process.bwy.study.R;

/**
 * 属性动画
 */
public class PropertyAnimationActivity extends AppCompatActivity {
    private Button valueStrarAnimBtn,valueCancelAnimBtn,valueAnimEg;
    private TextView valueTv;
    private ValueAnimator valueAnimator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);
        valueStrarAnimBtn = findViewById(R.id.value_animator_start);
        valueCancelAnimBtn = findViewById(R.id.value_anim_cancel);
        valueAnimEg = findViewById(R.id.value_anim_eg);

        valueTv = findViewById(R.id.value_anim_tv);

        valueStrarAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueAnimator=valueAnimaTor();
            }
        });

        valueCancelAnimBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueAnimator.cancel();
            }
        });

        valueAnimEg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PropertyAnimationActivity.this,ValueAnimEgActivity.class);
                startActivity(intent);
            }
        });


    }

    /**
     * 一、ValueAnimator :针对动画的值，不会对控件执行任何操作，
     * 可以给它设定从哪个值运动到哪个值，通过监听这些值的渐变过程来自己操作控件
     * ValueAnimator 只负责对指定区间进行动画运算
     * 我们需要对运算过程进行监听，然后对控件执行动画操作
     *二、 ValueAnimator常用的方法：
     * 1、ofInt()
     * 2、ofFloat()
     * 它们的参数类型都是可变长参数，所以可以传入任何数量的值：ofInt(0,90,40,50,0...) ofFloat(0f,90f,40f,50f,0f...)
     * 3、setDuration():设置动画时长 单位毫秒
     * 4、getAnimatedValue():获取ValueAnimator在运动时当前运动点的值
     * 5、start():开始动画
     * 6、setRepeatCount(int value):设置循环次数，设置为INFINITE表示无限循环，0表示不循环
     * 7、setRepeatMode(int value) :设置循环模式，取值有RESTART（正序开始）和REVERSE（倒叙重新开始）
     * 8、cancel():取消动画
     * 注意：当设置循环次数为无限次的时候，在当前activity结束的时候，必须调用cancel()函数取消动画，否则动画将无限循环，
     * 从而导致View无法释放，进一步导致整个Activity无法释放，引起内存泄漏
     * 三、ValueAnimator一共有两个监听器：
     * 1、AnimatorUpdateListener:作用是监听动画过程中值的实时变化
     * 添加的方法是 public void addUpdateListener(AnimatorUpdateListener listener)
     * 2、AnimatorListener:监听动画变化时的4个状态: start(动画开始)，end(动画结束)，cancel(动画取消),repeat(动画重复)
     * 添加方法是 public void addListener(AnimatorListener listener)
     * 移除监听器有两种方法：
     * 1、removeListener(AnimatorListener listener):移除指定监听器
     * 2、removeAllListener():移除所有监听器
     * 四、不常用方法：
     * setStartDelay(long startDelay):延时多久后动画开始
     */
    private ValueAnimator valueAnimaTor() {
        //第一步 创建valueAnimator实例
        valueAnimator = ValueAnimator.ofInt(0,400);
        valueAnimator.setDuration(3000);
        //第二步 添加监听事件
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int curValue = (int) animation.getAnimatedValue();
                Log.d("属性动画","curValue"+curValue);
                valueTv.layout(curValue,curValue,curValue+ valueTv.getWidth(),curValue+valueTv.getHeight());
            }
        });

        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                Log.d("属性动画","animationStart");
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Log.d("属性动画","animationEnd");
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                Log.d("属性动画","animationCancel");
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                Log.d("属性动画","animationRepeat");
            }
        });

        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
        valueAnimator.start();
        return valueAnimator;
    }
}
