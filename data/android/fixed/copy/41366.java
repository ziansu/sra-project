@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    animating = true;
    setTouchAble((!(animating)));
}