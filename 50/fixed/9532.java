public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    setActionBarTitle();
    invalidateOptionsMenu();
}