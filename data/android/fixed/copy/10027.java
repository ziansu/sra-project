@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    doDrawerMenuAction(menuItem.getItemId());
    drawerLayout.closeDrawers();
    return true;
}