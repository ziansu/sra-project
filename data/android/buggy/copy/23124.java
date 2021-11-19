public void clearPager() {
    android.util.Log.d("* SearchResultFrag *", "clearPager");
    mViewPager.setAdapter(null);
    mViewPager.removeAllViews();
}