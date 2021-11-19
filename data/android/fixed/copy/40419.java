@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    mForceReset = false;
    if (!(mIsRefreshing)) {
        mWillReleaseToRefresh = true;
        setHeaderForCurrentOffsetTop();
    }
}