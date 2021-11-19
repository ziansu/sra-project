@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    if (mNotify) {
        if ((mOnRefreshListener) != null) {
            mOnRefreshListener.onRefresh();
        }
        mNotify = false;
    }
}