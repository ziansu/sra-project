private void init() {
    setOrientation(com.universalrefresh.library.base.VERTICAL);
    setClickable(true);
    mTouchSlop = dpToPx(4);
    mIsEnablePullDown = enablePullDown();
    mIsEnablePullUp = enablePullUp();
}