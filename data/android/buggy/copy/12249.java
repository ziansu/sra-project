@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if ((callback) != null) {
        callback.onAnimationFinished();
    }
    ((android.view.ViewGroup) (getParent())).removeView(this);
}