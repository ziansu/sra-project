@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    super.onAnimationStart(animation);
    getFloatingToolbar().setVisibility(View.VISIBLE);
    getFab().setVisibility(View.INVISIBLE);
}