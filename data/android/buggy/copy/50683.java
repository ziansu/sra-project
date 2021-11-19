public void onDrawerOpened(android.view.View drawerView) {
    super.onDrawerOpened(drawerView);
    android.util.Log.d("drawer", "onDrawerOpened: ");
    getSupportActionBar().setTitle(mDrawerTitle);
    invalidateOptionsMenu();
}