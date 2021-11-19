@java.lang.Override
public void onStopNestedScroll(android.view.View target) {
    mNestedScrollingParentHelper.onStopNestedScroll(target);
    if ((mTotalUnconsumed) > 0) {
        finishSpinner();
        mTotalUnconsumed = 0;
    }
    stopNestedScroll();
}