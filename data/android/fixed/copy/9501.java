@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    if (window != null) {
        window.setStatusBarColor(((java.lang.Integer) (valueAnimator.getAnimatedValue())));
    }
}