@java.lang.Override
public void onClick(android.view.View view) {
    if ((!(isSettlingProcess)) && (isMediaPlayerStarted)) {
        ominext.com.readmestories.fragments.ReadingBookFragment fragment = mPagerAdapter.getFragment(mViewPager.getCurrentItem());
        fragment.onPlayClick();
    }
}