@java.lang.Override
public void onPageSelected(int position) {
    mCurrentItem = position;
    setSelectDot((position % (mCount)));
}