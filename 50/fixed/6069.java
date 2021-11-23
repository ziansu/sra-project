@java.lang.Override
public void onPause() {
    if (mPreferences.lastOpenedIsStartPagePreference()) {
        mPreferences.setStartPageIndex(viewPager.getCurrentItem());
    }
    super.onPause();
}