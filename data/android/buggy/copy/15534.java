private void addFragment() {
    if (mIsInSearchMode) {
        addSearchFragment();
    }else {
        addBrowserFragment();
    }
}