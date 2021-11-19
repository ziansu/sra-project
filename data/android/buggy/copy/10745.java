@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getFab().setVisibility(View.VISIBLE);
    getAnimationListener().onAnimationFinished();
}