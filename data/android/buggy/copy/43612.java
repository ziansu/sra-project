private void showEmpty() {
    mRecyclerView.setVisibility(View.GONE);
    mEmpty.setVisibility(View.GONE);
    mError.setVisibility(View.VISIBLE);
    mRefreshLayout.setRefreshing(false);
}