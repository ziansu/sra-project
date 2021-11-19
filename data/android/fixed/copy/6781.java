@java.lang.Override
protected void onDestroy() {
    mPagerAdapter.getFragment(mViewPager.getCurrentItem()).release();
    super.onDestroy();
}