@java.lang.Override
public void onChanged() {
    if ((mSwipeableView) != null) {
        if (mSwipeStarted) {
            mRestorePosition = mSwipeablePosition;
        }else {
            mSwipeableView.swipeStateReset();
            mSwipeableView = null;
        }
    }
}