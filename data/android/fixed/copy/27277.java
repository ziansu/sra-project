private void scrollLoadMore() {
    if ((mFooterLayout.getChildAt(0)) == (mLoadingView)) {
        if ((mLoadMoreListener) != null) {
            mLoadMoreListener.onLoadMore(false);
        }
    }
}