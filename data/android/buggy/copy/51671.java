@java.lang.Override
public void onClick(android.view.View view) {
    mCalenderListener.onSelectDate(mStartDate);
    mViewPager.setCurrentItem(mMiddlePoint);
}