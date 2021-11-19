@java.lang.Override
public void onResume() {
    if (isOnCreate) {
        mAdapter.setShouldStartAnimation(true);
        isOnCreate = false;
    }
    getFeeds();
    super.onResume();
}