@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    animateAlpha = 255 - ((java.lang.Integer) (animation.getAnimatedValue()));
    invalidate();
}