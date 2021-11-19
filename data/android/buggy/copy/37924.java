@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    mRevealView.setBackgroundColor(getResources().getColor(toColor));
    mRevealView.setVisibility(View.VISIBLE);
}