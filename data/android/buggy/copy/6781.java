@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mPagerAdapter.getFragment(mViewPager.getCurrentItem()).release();
}