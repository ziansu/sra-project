@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem menuItem) {
    onDrawerItemClick(menuItem.getItemId());
    mDrawerLayout.closeDrawers();
    return true;
}