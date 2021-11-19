public void stopLoadAndNoMoreData() {
    if (mPullLoading) {
        mPullLoad = false;
        mPullLoading = false;
        recyclerViewFooter.setState(LFRecyclerViewFooter.STATE_LOADOVER);
        resetFooterHeight();
    }else {
        recyclerViewFooter.setState(LFRecyclerViewFooter.STATE_LOADOVER);
    }
}