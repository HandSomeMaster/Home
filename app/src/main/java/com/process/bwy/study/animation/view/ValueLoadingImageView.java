package com.process.bwy.study.animation.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.process.bwy.study.R;

@SuppressLint("AppCompatCustomView")
public class ValueLoadingImageView extends ImageView {
    private int mTop;
    private ValueAnimator valueAnimator;
    //当前图片索引
    private int mCurImgDex = 0;
    //当前图片总张数
    private int mImgCount = 3;

    public ValueLoadingImageView(Context context) {
        super(context);
    }

    public ValueLoadingImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public ValueLoadingImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        mTop = top;
    }

    private void init() {
        valueAnimator = ValueAnimator.ofInt(200, 600, 200);
        valueAnimator.setDuration(4000);
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        valueAnimator.setRepeatMode(ValueAnimator.RESTART);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());

        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int dx = (int) animation.getAnimatedValue();
                setTop(mTop - dx);
            }
        });

        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                setImageDrawable(getResources().getDrawable(R.drawable.icon_time));
            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                mCurImgDex++;
                switch (mCurImgDex % mImgCount) {
                    case 0:
                        setImageDrawable(getResources().getDrawable(R.drawable.icon_time));
                        break;
                    case 1:
                        setImageDrawable(getResources().getDrawable(R.drawable.icon_shop_checked));
                        break;
                    case 2:
                        setImageDrawable(getResources().getDrawable(R.drawable.icon_zq));
                        break;
                        default:
                }
            }
        });
        valueAnimator.start();
    }


}
