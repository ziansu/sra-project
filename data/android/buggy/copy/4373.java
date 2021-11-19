@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    mDegree = ((float) (trembleAnimator.getAnimatedValue()));
    refresh();
}