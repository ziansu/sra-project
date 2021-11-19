@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    if (!(mNavigationDrawerFragment.isDrawerOpen())) {
        getMenuInflater().inflate(R.menu.main, menu);
        restoreActionBar();
        return true;
    }
    return super.onCreateOptionsMenu(menu);
}