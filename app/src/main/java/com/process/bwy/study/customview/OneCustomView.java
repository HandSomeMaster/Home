package com.process.bwy.study.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class OneCustomView extends View {


    public OneCustomView(Context context) {
        super(context);
    }

    public OneCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 测量控件尺寸
     *
     * @param widthMeasureSpec  （包含测量模式和测量尺寸）
     * @param heightMeasureSpec （包含测量模式和测量尺寸）
     *                          测量模式有三种：UNSPECIFIED、EXACTLY、AT_MOST
     *                          UNSPECIFIED：父容器没有对当前View有任何限制，当前View可以任意取尺寸
     *                          EXACTLY：当前的尺寸就是当前View应该取的尺寸
     *                          AT_MOST：当前尺寸是当前View能取的最大尺寸
     *                          wrap_content -->AT_MOST
     *                          match_content -->EXACTLY
     *                          固定尺寸 --> EXACTLY
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getViewSize(100, widthMeasureSpec);
        int height = getViewSize(100, heightMeasureSpec);

        if (width < height){
            height = width;
        }else {
            width = height;
        }
        setMeasuredDimension(width, height);
    }

    private int getViewSize(int defaultSize, int measureSpec) {

        int mySize = defaultSize;
        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);

        switch (mode) {
            case MeasureSpec.UNSPECIFIED: {
                //如果没有指定大小，就设置为默认大小
                mySize = defaultSize;
                break;
            }
            case MeasureSpec.AT_MOST: {
                //如果测量模式是最大取值为size,我们将大小取最小值
                mySize = size;
                break;
            }
            case MeasureSpec.EXACTLY: {
                //如果是固定的大小，那就不要去改变它
                mySize = size;
                break;
            }
        }
        return mySize;
    }


    /**
     * 绘制控件
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
