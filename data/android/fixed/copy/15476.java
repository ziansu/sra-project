@java.lang.Override
public void onRefresh() {
    if ((mAdapter) != null) {
        mAdapter.clear();
        mAdapter.addAll(mProducts);
    }
    fetchData();
    mSwipeRefreshLayout.setRefreshing(false);
}