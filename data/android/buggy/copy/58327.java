public void setHasLoading(boolean hasMoreData) {
    this.hasMoreData = hasMoreData;
    flag = true;
    com.zpauly.githubapp.adapter.LoadMoreRecyclerViewAdapter.notifyDataSetChanged();
}