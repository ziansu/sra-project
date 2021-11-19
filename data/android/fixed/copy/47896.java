@java.lang.Override
public void run() {
    swipeRefreshLayout.setRefreshing(false);
    loadingMore = true;
    getData();
}