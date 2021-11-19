@java.lang.Override
public void onRefresh() {
    mAdapter.clear();
    mAdapter.addAll(mProducts);
    fetchData();
    mSwipeRefreshLayout.setRefreshing(false);
}