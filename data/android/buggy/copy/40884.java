@java.lang.Override
public void onLoadMore(int page, int totalItemsCount) {
    int curSize = mAdapter.getItemCount();
    customLoadMoreDataFromApi(posts.get((curSize - 1)).get_id().toString());
}