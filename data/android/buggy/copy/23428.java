protected void selectLastSelectedTab() {
    if ((selectedTabPosition) >= 0) {
        android.support.design.widget.TabLayout.Tab selectedTab = tabLayout.getTabAt(selectedTabPosition);
        selectedTab.select();
    }
}