@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    int id = menuItem.getItemId();
    doMenuAction(id);
    return true;
}