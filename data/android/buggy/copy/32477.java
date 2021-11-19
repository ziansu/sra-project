@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
    menu.findItem(R.id.action_details).setVisible((!drawerOpen));
    return super.onPrepareOptionsMenu(menu);
}