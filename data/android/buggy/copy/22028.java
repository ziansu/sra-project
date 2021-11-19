private void showActionBarIfNeeded() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if (((getActionBar()) != null) && (!(actionBar.isShowing()))) {
        getActionBar().show();
    }
}