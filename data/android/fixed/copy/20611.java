public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
    mViewPager.setCurrentItem(tab.getPosition());
    currentPage = tab.getPosition();
    java.lang.System.out.println(tab.getPosition());
}