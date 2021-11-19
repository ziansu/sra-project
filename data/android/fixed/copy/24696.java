private void canBack() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(((fm.getBackStackEntryCount()) > 1));
    }
}