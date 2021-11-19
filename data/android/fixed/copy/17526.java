@java.lang.Override
public boolean onMenuItemActionCollapse(android.view.MenuItem item) {
    dayAdapter.setFilter(talks);
    return true;
}