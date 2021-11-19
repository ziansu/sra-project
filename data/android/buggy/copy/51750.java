@java.lang.Override
public void onNewWireUpdated(java.lang.String section) {
    mNews = mDataManager.getNews(mSection);
    mAdapter.notifyDataSetChanged();
    mSwipeRefreshLayout.setRefreshing(false);
    loading = true;
}