@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    mRevealView.setBackgroundColor(toColor);
    mRevealView.setVisibility(View.VISIBLE);
}