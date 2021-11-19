public void completeLoadMore() {
    mOnScrollListener.setLoading(false);
    mAdapter.setFooterStatus(EndlessAdapter.FooterStatus.GONE);
}