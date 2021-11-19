public void restoreActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayShowTitleEnabled(true);
    actionBar.setTitle(mTitle);
}