@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    float cVal = ((java.lang.Float) (animation.getAnimatedValue()));
    view.setScaleX(cVal);
    view.setScaleY(cVal);
}