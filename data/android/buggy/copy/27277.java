private void scrollLoadMore() {
    if ((mFooterLayout.getChildAt(0)) == (mLoadingView)) {
        mLoadMoreListener.onLoadMore(false);
    }
}