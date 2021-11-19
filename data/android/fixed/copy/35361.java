@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((selectedDrawerItem) != null) {
        setDrawerSelection(selectedDrawerItem);
        setToolbarTitle(selectedDrawerItem);
    }
}