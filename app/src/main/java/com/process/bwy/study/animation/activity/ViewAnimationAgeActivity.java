package com.process.bwy.study.animation.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.process.bwy.study.R;
import com.process.bwy.study.animation.adapter.ViewAnimationAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 补间动画 常用两种方式
 */
public class ViewAnimationAgeActivity  extends AppCompatActivity {

    RecyclerView rv;
    ViewAnimationAdapter  animationAdapter;
    private List<String> been;
    Animation rvAnimation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        rv = findViewById(R.id.view_animation_rv);
        setRvAnimation();
        been = new ArrayList<>();
        for (int i=0;i<10;i++){
            been.add("第"+i+"item");
        }
        rv.setLayoutManager(new LinearLayoutManager(this));
        animationAdapter = new ViewAnimationAdapter(this,been);
        rv.setAdapter(animationAdapter);
        rv.startLayoutAnimation(); //可以通过该方法控制动画在何时播放。
    }

    private void setRvAnimation() {
        rvAnimation = AnimationUtils.loadAnimation(this,R.anim.view_animaiton_rv);
        LayoutAnimationController lac=new LayoutAnimationController(rvAnimation);
        lac.setDelay(0.5f);
        lac.setOrder(LayoutAnimationController.ORDER_RANDOM);
        rv.setLayoutAnimation(lac);

    }
}
