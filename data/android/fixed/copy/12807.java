@java.lang.Override
public void showLoading() {
    mPrayerListView.showLoading();
    if ((mViewFlipper.getDisplayedChild()) != 1) {
        mViewFlipper.setDisplayedChild(0);
    }else {
        showSwipeRefreshLoading(true);
    }
}