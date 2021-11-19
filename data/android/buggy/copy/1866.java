@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    mIsRefreshing = false;
    if (mNotify) {
        if ((mOnRefreshListener) != null) {
            mOnRefreshListener.onRefresh();
        }
    }
}