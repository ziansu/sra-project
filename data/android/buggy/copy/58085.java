public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    setActionBarTitle(mTitle);
    invalidateOptionsMenu();
}