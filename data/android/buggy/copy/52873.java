@java.lang.Override
public void run() {
    adapter.notifyItemRangeInserted(previousSize, size());
    swipeRefreshLayout.setRefreshing(false);
}