@java.lang.Override
public void onPause() {
    audioVisualization.onPause();
    if (mPreferences.lastOpenedIsStartPagePreference()) {
        mPreferences.setStartPageIndex(viewPager.getCurrentItem());
    }
    super.onPause();
}