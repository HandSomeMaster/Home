package com.process.bwy.study.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleView extends View {
    private Paint paint = new Paint();


    public CircleView(Context context) {
        super(context);

    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(0xFFFF0000);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        /*
         画圆
        */
//        canvas.drawCircle(500,200,200,paint);
//        paint.setColor(0xFFFFFF00);
//        canvas.drawCircle(500,200,100,paint);

        /*
        画布背景设置
        */
//        canvas.drawColor(0xFFFFFF00);
//        canvas.drawRGB(225,0,225); canvas.drawRGB(0xFF,0x00,0xFF);
//        canvas.drawARGB(255,255,0,255); canvas.drawARGB(0xFF,0xFF,0,0xFF);
        /*
        画直线
        */
//        canvas.drawLine(100,100,500,200,paint);

        /*
        画点
        */
//        canvas.drawPoint(100,100,paint);

        /*
         *    画矩形   RectF、Rect两种
         *    RectF用来保存Float类型 Rect保存Int类型
         *    RectF(float left, float top, float right, float bottom)
         *    Rect(int left, int top, int right, int bottom)
         */
//        RectF rectF = new RectF(10f,10f,100f,100f);
//        Rect rect = new Rect(150,100,300,100);
//        canvas.drawRect(rectF,paint);
//        canvas.drawRect(rect,paint);


        /*
        通过画路径来绘制不同形状
        void drawPath(Path path, Paint paint)
        1、画直线路径 一般三个方法
        void moveTo(float x1, float y1):（x1,y1）是直线的起始点，就是将直线路径的绘制点定在（x1,y1）位置
        void lineTo(float x2, float y2): (x2,y2)是直线的终点，lineTo方法可以一直使用，所以（x2,y2）也是下次绘制的起始点
        void close() 如果连续绘制几条直线没有形成闭环，那么调用了close（）方法可以将首尾点连接起来，形成闭环
        */
//        Path path = new Path();
//        path.moveTo(100,100);//绘制起始点
//        path.lineTo(500,500);//第一条直线的终点
//        path.lineTo(100,500);//画第二条直线
//        path.close();
        /*
        2、画弧线路径，弧线是从椭圆上截取的一部分
        void arcTo(RectF oval, float startAngle, float sweepAngle)
        RectF oval:生成椭圆的矩形
        float startAngle:弧开始的角度，以x轴正方向为0度
        float sweepAngle:弧持续的角度
         */
//        path.moveTo(100,10);
//        RectF rectF = new RectF(100, 10, 200, 400);
//        path.arcTo(rectF, 0, 270);
//        canvas.drawPath(path, paint);




    }
}
