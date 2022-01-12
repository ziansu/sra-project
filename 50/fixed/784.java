private void setSelectedTab(com.bigscreen.iconictabbar.view.IconicTab tab, int tabPosition) {
    selectedTab = tab;
    selectedTabPosition = tabPosition;
    if ((onTabSelectedListener) != null)
        onTabSelectedListener.onSelected(selectedTab, selectedTabPosition);
    
    selectedTab.setSelected();
}