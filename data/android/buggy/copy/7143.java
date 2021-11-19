@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    int id = tab.getPosition();
}