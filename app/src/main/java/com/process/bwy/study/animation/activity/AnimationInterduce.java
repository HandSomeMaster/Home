package com.process.bwy.study.animation.activity;

/**
 * 动画介绍
 */
public class AnimationInterduce {

    /**
     * 一、 Android有两种动画框架：
     * 1、属性动画   2、View动画（补间动画和逐帧动画）
     * 首选属性动画 （更灵活，功能更多）
     * 二、补间动画有四种类型：
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
     * 五、时间插值器（Interpolator）：用来指定动画如何变化的变量：
     *  通过实现插值器可以自定义动画的变化速率，系统提供以下插值器：
     *  1、AccelerateDecelerateInterpolator:加速减速插值器，在开始和结束的地方速率改变比较慢，在中间时候加速
     *  2、AccelerateInterpolator:加速插值器 开始比较慢后面加速
     *  3、DecelerateInterpolator:减速插值器 开始一瞬间加速到最大值，然后逐渐变慢
     *  4、LinearInterpolator:线性插值器 匀速加速器
     *  5、BounceInterpolator:弹跳插值器 控件自由落地后回弹的效果
     *  6、AnticipateInterpolator:初始偏移插值器 动画开始的时候向前偏移一段距离，然后应用动画
     *  7、OvershootInterpolator:结束偏移插值器 动画结束时，沿动画方向继续运动一段距离后再结束动画
     *  8、AnticipateOvershootInterpolator:6和7的合体
     *  9、CycleInterpolator:循环插值器 表示动画循环播放特定的次数
     *  可直接在XML文件里面引用插值器 android:interpolator=""
     *  也可通过setInterpolator()方法设置插值器
     *  对于ViewAnimation而言，仅允许setInterpolator（）方法来设置插值器
     *  但是对于属性动画而言，不仅可以设置插值器，还可以设置Evaluator,可以自定义Interpolator
     */
}
