private void selectItem(int position) {
    mCurrentSelectedPosition = position;
    mAdapter.selectPosition(position);
    closeDrawer();
    if ((mCallbacks) != null) {
        mCallbacks.onNavigationDrawerItemSelected(position);
    }
}