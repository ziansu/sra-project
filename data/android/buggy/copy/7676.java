@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    int id = menuItem.getItemId();
    menu.clear();
    doMenuAction(id);
    return true;
}