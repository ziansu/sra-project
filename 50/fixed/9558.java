@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    float progress = ((float) (valueAnimator.getAnimatedValue()));
    updateClipPath(((clipStartRadius) + progress));
}