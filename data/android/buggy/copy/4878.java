@java.lang.Override
public void onBackPressed() {
    if (mNavigationDrawerFragment.isDrawerOpen())
        mNavigationDrawerFragment.closeDrawer();
    else
        super.onBackPressed();
    
    this.finish();
}