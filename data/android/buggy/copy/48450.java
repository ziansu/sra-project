@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerPane);
    return super.onPrepareOptionsMenu(menu);
}