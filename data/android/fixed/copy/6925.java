@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    if ((viewPagerAdapter.getCurrentFragment()) != null) {
        viewPagerAdapter.getCurrentFragment().onResume();
    }
}