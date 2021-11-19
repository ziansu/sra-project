@java.lang.Override
public void onDrawerOpened(android.view.View drawerView) {
    if ((mDrawerToggle) != null)
        mDrawerToggle.onDrawerOpened(drawerView);
    
    getSupportActionBar().setTitle(R.string.app_name);
}