@java.lang.Override
public void onRefresh() {
    if (!(mRefreshLayout.isRefreshing())) {
        mPageCount = 1;
        mPostAdapter.clear();
        mRefreshLayout.setRefreshing(true);
    }
}