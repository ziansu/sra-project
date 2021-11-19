@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    android.util.Log.e("tag", "anim onAnimationEnd");
    getLinRoot().setVisibility(View.GONE);
}