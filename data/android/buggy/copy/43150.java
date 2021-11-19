@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mViewPager.setCurrentItem(0);
    return false;
}