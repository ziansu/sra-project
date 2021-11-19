@java.lang.Override
protected void onPause() {
    super.onPause();
    com.way.common.util.PreferenceUtils.setPrefInt(this, com.way.yahoo.MainActivity.INSTANCESTATE_TAB, mMainViewPager.getCurrentItem());
}