@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    this.onAnimationEnd(animation);
    topSearch.setVisibility(View.VISIBLE);
}