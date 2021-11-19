@java.lang.Override
public void onRefresh() {
    if (!(mRefreshLayout.isRefreshing())) {
        mBoardAdapter.refresh();
    }
}