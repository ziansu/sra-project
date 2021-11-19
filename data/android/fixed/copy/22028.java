private void showActionBarIfNeeded() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if ((actionBar != null) && (!(actionBar.isShowing()))) {
        actionBar.show();
    }
}