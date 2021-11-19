@java.lang.Override
protected void onResume() {
    super.onResume();
    setupDrawer();
    if ((selectedDrawerItem) != null) {
        setDrawerSelection(selectedDrawerItem);
        setToolbarTitle(selectedDrawerItem);
    }
}