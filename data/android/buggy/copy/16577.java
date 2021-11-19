@java.lang.Override
public void onTabClick(com.bigscreen.iconictabbar.view.IconicTab tabBottomBar, int position) {
    if ((onTabSelectedListener) != null) {
        setUnselectedTab(selectedTab, selectedTabPosition);
        setSelectedTab(tabBottomBar, position);
    }
}