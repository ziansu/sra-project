private void addFragment() {
    if (mIsInSearchMode) {
        addBrowserFragment();
        addSearchFragment();
    }else {
        addBrowserFragment();
    }
}