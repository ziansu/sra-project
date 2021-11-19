@java.lang.Override
public void run() {
    adapter.notifyItemRangeInserted(0, newPostList.size());
    swipeRefreshLayout.setRefreshing(false);
}