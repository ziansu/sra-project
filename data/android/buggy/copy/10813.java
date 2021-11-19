private void addLoadMore(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    if (isLoadMore()) {
        mLoadingMoreEnable = true;
        mRequestLoadMoreListener.onLoadMoreRequested();
    }
}